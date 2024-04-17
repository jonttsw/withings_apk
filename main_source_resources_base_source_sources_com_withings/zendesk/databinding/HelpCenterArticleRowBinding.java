package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class HelpCenterArticleRowBinding implements a {
    public final MaterialTextView helpCenterArticleTitle;
    private final MaterialTextView rootView;

    private HelpCenterArticleRowBinding(MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.rootView = materialTextView;
        this.helpCenterArticleTitle = materialTextView2;
    }

    public static HelpCenterArticleRowBinding bind(View view) {
        if (view != null) {
            MaterialTextView materialTextView = (MaterialTextView) view;
            return new HelpCenterArticleRowBinding(materialTextView, materialTextView);
        }
        throw new NullPointerException("rootView");
    }

    public static HelpCenterArticleRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HelpCenterArticleRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.help_center_article_row, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialTextView getRoot() {
        return this.rootView;
    }
}
