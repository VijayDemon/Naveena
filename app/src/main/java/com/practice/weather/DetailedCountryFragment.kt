package com.practice.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.practice.weather.databinding.FragmentDetailedCountryBinding
import com.practice.weather.databinding.FragmentListingCountryBinding

class DetailedCountryFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding :FragmentDetailedCountryBinding = DataBindingUtil.setContentView(requireActivity()
                , R.layout.fragment_detailed_country)
         return super.onCreateView(inflater, container, savedInstanceState)
    }


}