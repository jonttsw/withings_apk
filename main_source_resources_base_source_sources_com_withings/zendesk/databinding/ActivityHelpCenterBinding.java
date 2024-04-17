package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.s2;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class ActivityHelpCenterBinding implements a {
    public final ImageButton clearText;
    public final ConstraintLayout container;
    private final ConstraintLayout rootView;
    public final TextInputEditText search;
    public final FrameLayout searchIconAndBg;
    public final Toolbar supportToolbar;

    private ActivityHelpCenterBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ConstraintLayout constraintLayout2, TextInputEditText textInputEditText, FrameLayout frameLayout, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.clearText = imageButton;
        this.container = constraintLayout2;
        this.search = textInputEditText;
        this.searchIconAndBg = frameLayout;
        this.supportToolbar = toolbar;
    }

    public static ActivityHelpCenterBinding bind(View view) {
        int i11 = R.id.clear_text;
        ImageButton imageButton = (ImageButton) s2.g(view, i11);
        if (imageButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R.id.search;
            TextInputEditText textInputEditText = (TextInputEditText) s2.g(view, i11);
            if (textInputEditText != null) {
                i11 = R.id.search_icon_and_bg;
                FrameLayout frameLayout = (FrameLayout) s2.g(view, i11);
                if (frameLayout != null) {
                    i11 = R.id.support_toolbar;
                    Toolbar toolbar = (Toolbar) s2.g(view, i11);
                    if (toolbar != null) {
                        return new ActivityHelpCenterBinding(constraintLayout, imageButton, constraintLayout, textInputEditText, frameLayout, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ActivityHelpCenterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHelpCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.activity_help_center, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
