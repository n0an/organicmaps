package com.mapswithme.maps.base;

import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import com.mapswithme.maps.R;
import com.mapswithme.maps.dialog.ProgressDialogFragment;

import java.util.Objects;

public abstract class BaseAsyncOperationFragment extends BaseMwmFragment
{
  private static final String PROGRESS_DIALOG_TAG = "base_progress_dialog";

  protected void showProgress()
  {
    final int resId = getProgressMessageId();
    final String title = getString(resId);
    final ProgressDialogFragment dialog = ProgressDialogFragment.newInstance(title);
    getParentFragmentManager()
           .beginTransaction()
           .add(dialog, PROGRESS_DIALOG_TAG)
           .commitAllowingStateLoss();
  }

  @StringRes
  protected int getProgressMessageId()
  {
    return R.string.downloading;
  }

  protected void hideProgress()
  {
    final FragmentManager fm = getParentFragmentManager();
    final DialogFragment frag = (DialogFragment) fm.findFragmentByTag(PROGRESS_DIALOG_TAG);
    if (frag != null)
      frag.dismissAllowingStateLoss();
  }
}
