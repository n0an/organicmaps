package com.mapswithme.maps.maplayer;

import android.content.Context;
import android.view.View;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

import com.mapswithme.maps.R;
import com.mapswithme.maps.maplayer.isolines.IsolinesManager;
import com.mapswithme.util.Utils;

public abstract class AbstractIsoLinesClickListener extends DefaultClickListener
{

  public AbstractIsoLinesClickListener(@NonNull LayersAdapter adapter)
  {
    super(adapter);
  }

  @CallSuper
  @Override
  public void onItemClickInternal(@NonNull View v, @NonNull BottomSheetItem item)
  {
    Context context = v.getContext();
    if (IsolinesManager.from(context).shouldShowNotification())
      Utils.showSnackbar(context, v.getRootView(), R.string.isolines_toast_zooms_1_10);
  }
}
