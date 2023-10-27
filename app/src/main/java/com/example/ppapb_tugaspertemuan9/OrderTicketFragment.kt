package com.example.ppapb_tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ppapb_tugaspertemuan9.R
import com.example.ppapb_tugaspertemuan9.databinding.FragmentOrderTicketBinding

class OrderTicketFragment : Fragment() {
    private lateinit var binding: FragmentOrderTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            val textViewJenisTiket = binding.jenisTiket

            textViewJenisTiket.setOnClickListener {
                val action = OrderTicketFragmentDirections.actionOrderTicketFragmentToChooseTicketFragment()
                findNavController().navigate(action)
            }

            val selectedTicketType = arguments?.getString("selectedTicketType")

            selectedTicketType?.let {
                textViewJenisTiket.text = it
            }
        }
    }
}