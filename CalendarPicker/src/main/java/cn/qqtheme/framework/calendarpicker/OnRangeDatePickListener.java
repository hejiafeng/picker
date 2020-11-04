package cn.qqtheme.framework.calendarpicker;

import androidx.annotation.NonNull;

import java.util.Date;

public interface OnRangeDatePickListener {

    void onDatePicked(@NonNull Date startDate, @NonNull Date endDate);

}
