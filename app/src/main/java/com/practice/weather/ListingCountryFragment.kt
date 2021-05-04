package com.practice.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.practice.weather.databinding.FragmentListingCountryBinding

class ListingCountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding :FragmentListingCountryBinding = DataBindingUtil.
        inflate(inflater,R.layout.fragment_listing_country,container,false)
       binding.go.setOnClickListener(
           Navigation.createNavigateOnClickListener(R.id.action_listingCountryFragment_to_detailedCountryFragment)


       )







        return binding.root
    }


}