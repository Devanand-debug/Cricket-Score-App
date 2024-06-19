package com.devanand.vedteamcricketapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devanand.vedteamcricketapp.R
import com.devanand.vedteamcricketapp.databinding.FragmentOpeningPlayerBinding
import com.devanand.vedteamcricketapp.databinding.FragmentScorecardBinding

class ScorecardFragment : Fragment() {

    private lateinit var binding : FragmentScorecardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScorecardBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}