package com.example.ppapb_tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ppapb_tugaspertemuan9.databinding.FragmentTicketBinding

class TicketFragment : Fragment() {
    private lateinit var binding: FragmentTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTicketBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val action = TicketFragmentDirections.actionTicketFragmentToOrderTicketFragment()
        val btnBuy = binding.btnBuy

        btnBuy.setOnClickListener {
            findNavController().navigate(action)
        }
    }
}