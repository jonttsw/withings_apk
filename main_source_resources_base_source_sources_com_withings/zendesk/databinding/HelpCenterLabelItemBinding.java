package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.s2;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class HelpCenterLabelItemBinding implements a {
    public final ImageView image;
    public final TextView label;
    private final ConstraintLayout rootView;

    private HelpCenterLabelItemBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.image = imageView;
        this.label = textView;
    }

    public static HelpCenterLabelItemBinding bind(View view) {
        int i11 = R.id.image;
        ImageView imageView = (ImageView) s2.g(view, i11);
        if (imageView != null) {
            i11 = R.id.label;
            TextView textView = (TextView) s2.g(view, i11);
            if (textView != null) {
                return new HelpCenterLabelItemBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static HelpCenterLabelItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HelpCenterLabelItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.help_center_label_item, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
