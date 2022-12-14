// Generated by view binder compiler. Do not edit!
package com.example.carrotmarket_cloneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.carrotmarket_cloneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegisterClear;

  @NonNull
  public final EditText etIdClear;

  @NonNull
  public final EditText etNameClear;

  @NonNull
  public final EditText etNicknameClear;

  @NonNull
  public final EditText etPasswordClear;

  @NonNull
  public final EditText etPhoneClear;

  @NonNull
  public final EditText etTown;

  @NonNull
  public final Spinner spinnerCity;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnRegisterClear, @NonNull EditText etIdClear, @NonNull EditText etNameClear,
      @NonNull EditText etNicknameClear, @NonNull EditText etPasswordClear,
      @NonNull EditText etPhoneClear, @NonNull EditText etTown, @NonNull Spinner spinnerCity) {
    this.rootView = rootView;
    this.btnRegisterClear = btnRegisterClear;
    this.etIdClear = etIdClear;
    this.etNameClear = etNameClear;
    this.etNicknameClear = etNicknameClear;
    this.etPasswordClear = etPasswordClear;
    this.etPhoneClear = etPhoneClear;
    this.etTown = etTown;
    this.spinnerCity = spinnerCity;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register_clear;
      Button btnRegisterClear = ViewBindings.findChildViewById(rootView, id);
      if (btnRegisterClear == null) {
        break missingId;
      }

      id = R.id.et_id_clear;
      EditText etIdClear = ViewBindings.findChildViewById(rootView, id);
      if (etIdClear == null) {
        break missingId;
      }

      id = R.id.et_name_clear;
      EditText etNameClear = ViewBindings.findChildViewById(rootView, id);
      if (etNameClear == null) {
        break missingId;
      }

      id = R.id.et_nickname_clear;
      EditText etNicknameClear = ViewBindings.findChildViewById(rootView, id);
      if (etNicknameClear == null) {
        break missingId;
      }

      id = R.id.et_password_clear;
      EditText etPasswordClear = ViewBindings.findChildViewById(rootView, id);
      if (etPasswordClear == null) {
        break missingId;
      }

      id = R.id.et_phone_clear;
      EditText etPhoneClear = ViewBindings.findChildViewById(rootView, id);
      if (etPhoneClear == null) {
        break missingId;
      }

      id = R.id.et_town;
      EditText etTown = ViewBindings.findChildViewById(rootView, id);
      if (etTown == null) {
        break missingId;
      }

      id = R.id.spinner_city;
      Spinner spinnerCity = ViewBindings.findChildViewById(rootView, id);
      if (spinnerCity == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnRegisterClear, etIdClear,
          etNameClear, etNicknameClear, etPasswordClear, etPhoneClear, etTown, spinnerCity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
