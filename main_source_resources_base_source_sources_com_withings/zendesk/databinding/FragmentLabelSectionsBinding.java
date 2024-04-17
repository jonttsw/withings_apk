package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.s2;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class FragmentLabelSectionsBinding implements a {
    public final MaterialTextView label;
    public final View popularQuestionsDivider;
    public final RecyclerView popularQuestionsList;
    public final MaterialTextView popularQuestionsTitle;
    private final NestedScrollView rootView;
    public final RecyclerView sections;

    private FragmentLabelSectionsBinding(NestedScrollView nestedScrollView, MaterialTextView materialTextView, View view, RecyclerView recyclerView, MaterialTextView materialTextView2, RecyclerView recyclerView2) {
        this.rootView = nestedScrollView;
        this.label = materialTextView;
        this.popularQuestionsDivider = view;
        this.popularQuestionsList = recyclerView;
        this.popularQuestionsTitle = materialTextView2;
        this.sections = recyclerView2;
    }

    public static FragmentLabelSectionsBinding bind(View view) {
        View g11;
        int i11 = R.id.label;
        MaterialTextView materialTextView = (MaterialTextView) s2.g(view, i11);
        if (materialTextView != null && (g11 = s2.g(view, (i11 = R.id.popularQuestions_divider))) != null) {
            i11 = R.id.popularQuestions_list;
            RecyclerView recyclerView = (RecyclerView) s2.g(view, i11);
            if (recyclerView != null) {
                i11 = R.id.popularQuestions_title;
                MaterialTextView materialTextView2 = (MaterialTextView) s2.g(view, i11);
                if (materialTextView2 != null) {
                    i11 = R.id.sections;
                    RecyclerView recyclerView2 = (RecyclerView) s2.g(view, i11);
                    if (recyclerView2 != null) {
                        return new FragmentLabelSectionsBinding((NestedScrollView) view, materialTextView, g11, recyclerView, materialTextView2, recyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentLabelSectionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLabelSectionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.fragment_label_sections, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
