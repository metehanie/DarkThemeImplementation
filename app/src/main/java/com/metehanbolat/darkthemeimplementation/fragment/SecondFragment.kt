package com.metehanbolat.darkthemeimplementation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.metehanbolat.darkthemeimplementation.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.secondFragmentButton.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToSecondActivity()
            findNavController().navigate(action)
        }

        binding.secondFragmentButton2.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToBottomSheetFragment()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}