package com.example.application

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.application.databinding.FragmentHomeBinding
import android.widget.ImageView



class HomeF : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val book3 = view.findViewById<ImageView>(R.id.harry_p_1)
        book3.setOnClickListener {
            val intent = Intent(requireContext(), Item::class.java)
            startActivity(intent)
        }
    }


}