package com.oxandon.calendar.protocol;

import androidx.annotation.NonNull;

import java.util.Date;

/**
 * 日历选择监听器
 * Created by peng on 2017/8/4.
 */

public interface OnCalendarSelectListener {
    void onSingleSelect(@NonNull Date date);

    void onDoubleSelect(@NonNull Date before, @NonNull Date after);
}