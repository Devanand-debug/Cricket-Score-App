package com.devanand.vedteamcricketapp.screens

import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.devanand.vedteamcricketapp.R
import com.devanand.vedteamcricketapp.databinding.FragmentHomeBinding
import com.devanand.vedteamcricketapp.databinding.FragmentOpeningPlayerBinding


class OpeningPlayerFragment : Fragment() {

    private lateinit var binding : FragmentOpeningPlayerBinding

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Set toolbar title when fragment is created
        (requireActivity() as AppCompatActivity).supportActionBar?.title = "Select Opening Players"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOpeningPlayerBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStartMatch.setOnClickListener {
            findNavController().navigate(R.id.action_openingPlayerFragment_to_scorecardFragment)
        }
    }

}