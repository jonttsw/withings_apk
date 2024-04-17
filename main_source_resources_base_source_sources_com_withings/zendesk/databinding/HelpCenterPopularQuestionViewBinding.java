package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.s2;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class HelpCenterPopularQuestionViewBinding implements a {
    public final MaterialTextView articleTitle;
    private final MaterialCardView rootView;

    private HelpCenterPopularQuestionViewBinding(MaterialCardView materialCardView, MaterialTextView materialTextView) {
        this.rootView = materialCardView;
        this.articleTitle = materialTextView;
    }

    public static HelpCenterPopularQuestionViewBinding bind(View view) {
        int i11 = R.id.article_title;
        MaterialTextView materialTextView = (MaterialTextView) s2.g(view, i11);
        if (materialTextView != null) {
            return new HelpCenterPopularQuestionViewBinding((MaterialCardView) view, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static HelpCenterPopularQuestionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HelpCenterPopularQuestionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.help_center_popular_question_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
