package com.example.ppapb_tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.ppapb_tugaspertemuan9.databinding.FragmentChooseTicketBinding

class ChooseTicketFragment : Fragment() {
    private lateinit var binding: FragmentChooseTicketBinding
    private lateinit var spinner: Spinner
    private lateinit var buyButton: AppCompatButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinner = binding.spinnerJenisTiket

        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.jenis_tiket,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        buyButton = binding.btnBuy2
        buyButton.setOnClickListener {
            val selectedTicketType = spinner.selectedItem.toString()

            findNavController().navigateUp()
        }
    }
}