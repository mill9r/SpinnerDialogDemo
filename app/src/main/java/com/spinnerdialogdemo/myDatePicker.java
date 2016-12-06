package com.spinnerdialogdemo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.app.DatePickerDialog;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by sbmt on 06.12.2016.
 */

public class myDatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        MainActivity.tv.setText(year + "-" + (month + 1) + "-" + day);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        DatePickerDialog dp = new DatePickerDialog(getActivity(), this, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        //для отображения календарем
        dp.getDatePicker().setCalendarViewShown(true);
        dp.getDatePicker().setSpinnersShown(false);

        return dp;
    }
}
