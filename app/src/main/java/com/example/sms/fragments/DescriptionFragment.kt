package com.example.sms.fragments

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sms.R
import com.example.sms.adapter.OnClick
import com.example.sms.adapter.RecyclerAdapter
import com.example.sms.databinding.FragmentDescriptionBinding
import com.example.sms.models.Sher

class DescriptionFragment : Fragment(),OnClick {

    private lateinit var binding: FragmentDescriptionBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionBinding.inflate(inflater,container,false)

        when(arguments?.getInt("data")){
            1 ->{
                binding.fragmentHeading.text = "Sevgi sherlari"
                binding.recyclerView.adapter = RecyclerAdapter(initListSevgi(),this)
            }
            2 ->{
                binding.fragmentHeading.text = "Sog'inch sherlari"
                binding.recyclerView.adapter = RecyclerAdapter(initListSoginch(),this)
            }
            3 ->{
                binding.fragmentHeading.text = "Tabrik sherlari"
                binding.recyclerView.adapter = RecyclerAdapter(initListTabrik(),this)
            }
            4 ->{
                binding.fragmentHeading.text = "Ota-ona sherlari"
                binding.recyclerView.adapter = RecyclerAdapter(initListOta(),this)
            }
            5 ->{
                binding.fragmentHeading.text = "Do'stlik sherlari"
                binding.recyclerView.adapter = RecyclerAdapter(initListDustik(),this)
            }
            6 ->{
                binding.fragmentHeading.text = "Hazil sherlari"
                binding.recyclerView.adapter = RecyclerAdapter(initListHazil(),this)
            }
            else -> Toast.makeText(requireContext(), "${arguments?.getInt("data")}", Toast.LENGTH_SHORT).show()
        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }
        return binding.root
    }

    private fun initListSevgi():ArrayList<Sher>{

        val list = arrayListOf<Sher>()
        val heading = "Men uchun ham o'zingni asra. Sevgi"
        val sher = "Kamtar bo’l kamtar bo’l kamtar bo’l inson, Bilib yo’q topmoqdan yoqotmoq oson, Hech qachon berilma kibr-u havoga"
        var  model = Sher(heading,sher)
        for (i in 0 until  15){
            list.add(model)
        }
        return list
    }
    private fun initListSoginch():ArrayList<Sher>{

        val list = arrayListOf<Sher>()
        val heading = "Men uchun ham o'zingni asra. Sog'inch"
        val sher = "Kamtar bo’l kamtar bo’l kamtar bo’l inson, Bilib yo’q topmoqdan yoqotmoq oson, Hech qachon berilma kibr-u havoga"
        var  model = Sher(heading,sher)
        for (i in 0 until  15){
            list.add(model)
        }
        return list
    }
    private fun initListTabrik():ArrayList<Sher>{

        val list = arrayListOf<Sher>()
        val heading = "Men uchun ham o'zingni asra. Tabrik"
        val sher = "Kamtar bo’l kamtar bo’l kamtar bo’l inson, Bilib yo’q topmoqdan yoqotmoq oson, Hech qachon berilma kibr-u havoga"
        var  model = Sher(heading,sher)
        for (i in 0 until  15){
            list.add(model)
        }
        return list
    }
    private fun initListOta():ArrayList<Sher>{

        val list = arrayListOf<Sher>()
        val heading = "Men uchun ham o'zingni asra. Ota-ona"
        val sher = "Kamtar bo’l kamtar bo’l kamtar bo’l inson, Bilib yo’q topmoqdan yoqotmoq oson, Hech qachon berilma kibr-u havoga"
        var  model = Sher(heading,sher)
        for (i in 0 until  15){
            list.add(model)
        }
        return list
    }
    private fun initListDustik():ArrayList<Sher>{

        val list = arrayListOf<Sher>()
        val heading = "Men uchun ham o'zingni asra. Do'stlik"
        val sher = "Kamtar bo’l kamtar bo’l kamtar bo’l inson, Bilib yo’q topmoqdan yoqotmoq oson, Hech qachon berilma kibr-u havoga"
        var  model = Sher(heading,sher)
        for (i in 0 until  15){
            list.add(model)
        }
        return list
    }
    private fun initListHazil():ArrayList<Sher>{

        val list = arrayListOf<Sher>()
        val heading = "Men uchun ham o'zingni asra. Hazil"
        val sher = "Kamtar bo’l kamtar bo’l kamtar bo’l inson, Bilib yo’q topmoqdan yoqotmoq oson, Hech qachon berilma kibr-u havoga"
        var  model = Sher(heading,sher)
        for (i in 0 until  15){
            list.add(model)
        }
        return list
    }

    override fun onItemClick(model: Sher) {
        val dialog = AlertDialog.Builder(requireContext()).create()
        val dialogView = layoutInflater.inflate(R.layout.dialog_view,binding.root,false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setView(dialogView)
        dialog.show()
    }

}