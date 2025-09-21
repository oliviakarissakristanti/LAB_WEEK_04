package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Klik Affogato
        view.findViewById<TextView>(R.id.affogato).setOnClickListener {
            val bundle = Bundle().apply {
                putString("coffeeName", "Affogato")
            }
            findNavController().navigate(R.id.action_listFragment_to_detailFragment, bundle)
        }

        // Klik Americano
        view.findViewById<TextView>(R.id.americano).setOnClickListener {
            val bundle = Bundle().apply {
                putString("coffeeName", "Americano")
            }
            findNavController().navigate(R.id.action_listFragment_to_detailFragment, bundle)
        }
    }
}
