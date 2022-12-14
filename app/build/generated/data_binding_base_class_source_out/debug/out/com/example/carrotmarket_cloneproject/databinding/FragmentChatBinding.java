// Generated by view binder compiler. Do not edit!
package com.example.carrotmarket_cloneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.carrotmarket_cloneproject.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChatBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton buttonBell;

  @NonNull
  public final ImageButton buttonQR;

  @NonNull
  public final AppBarLayout layoutGroupChat;

  @NonNull
  public final TextView textViewChatList;

  private FragmentChatBinding(@NonNull FrameLayout rootView, @NonNull ImageButton buttonBell,
      @NonNull ImageButton buttonQR, @NonNull AppBarLayout layoutGroupChat,
      @NonNull TextView textViewChatList) {
    this.rootView = rootView;
    this.buttonBell = buttonBell;
    this.buttonQR = buttonQR;
    this.layoutGroupChat = layoutGroupChat;
    this.textViewChatList = textViewChatList;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_bell;
      ImageButton buttonBell = ViewBindings.findChildViewById(rootView, id);
      if (buttonBell == null) {
        break missingId;
      }

      id = R.id.button_QR;
      ImageButton buttonQR = ViewBindings.findChildViewById(rootView, id);
      if (buttonQR == null) {
        break missingId;
      }

      id = R.id.layout_group_chat;
      AppBarLayout layoutGroupChat = ViewBindings.findChildViewById(rootView, id);
      if (layoutGroupChat == null) {
        break missingId;
      }

      id = R.id.textView_chat_list;
      TextView textViewChatList = ViewBindings.findChildViewById(rootView, id);
      if (textViewChatList == null) {
        break missingId;
      }

      return new FragmentChatBinding((FrameLayout) rootView, buttonBell, buttonQR, layoutGroupChat,
          textViewChatList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
