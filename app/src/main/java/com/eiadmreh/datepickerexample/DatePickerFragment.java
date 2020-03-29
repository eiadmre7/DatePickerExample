package com.eiadmreh.datepickerexample;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import java.util.Calendar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DatePickerFragment extends DialogFragment {
    Calendar calendar;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        calendar=Calendar.getInstance();
        int YYYY=calendar.get(Calendar.YEAR);
        int mm=calendar.get(Calendar.MONTH);
        int dd=calendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener)getActivity(),YYYY,mm,dd);
    }
}
