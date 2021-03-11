package com.example.sms.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sms.R
import com.example.sms.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val bundle = Bundle()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)

        binding.sevgi.setOnClickListener {
            bundle.putInt("data",1)
            findNavController().navigate(R.id.descriptionFragment,bundle)
        }
        binding.soginch.setOnClickListener {
            bundle.putInt("data",2)
            findNavController().navigate(R.id.descriptionFragment,bundle)
        }
        binding.tabrik.setOnClickListener {
            bundle.putInt("data",3)
            findNavController().navigate(R.id.descriptionFragment,bundle)
        }
        binding.otaOna.setOnClickListener {
            bundle.putInt("data",4)
            findNavController().navigate(R.id.descriptionFragment,bundle)
        }
        binding.dustlik.setOnClickListener {
            bundle.putInt("data",5)
            findNavController().navigate(R.id.descriptionFragment,bundle)
        }
        binding.hazil.setOnClickListener {
            bundle.putInt("data",6)
            findNavController().navigate(R.id.descriptionFragment,bundle)
        }

        return binding.root
    }

}