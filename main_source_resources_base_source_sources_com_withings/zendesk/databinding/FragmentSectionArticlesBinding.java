package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.camera2.internal.s2;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class FragmentSectionArticlesBinding implements a {
    public final RecyclerView articles;
    public final MaterialTextView label;
    public final ImageView labelGlyph;
    public final Group popularQuestions;
    public final View popularQuestionsDivider;
    public final RecyclerView popularQuestionsList;
    public final MaterialTextView popularQuestionsTitle;
    private final NestedScrollView rootView;
    public final MaterialTextView section;

    private FragmentSectionArticlesBinding(NestedScrollView nestedScrollView, RecyclerView recyclerView, MaterialTextView materialTextView, ImageView imageView, Group group, View view, RecyclerView recyclerView2, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.rootView = nestedScrollView;
        this.articles = recyclerView;
        this.label = materialTextView;
        this.labelGlyph = imageView;
        this.popularQuestions = group;
        this.popularQuestionsDivider = view;
        this.popularQuestionsList = recyclerView2;
        this.popularQuestionsTitle = materialTextView2;
        this.section = materialTextView3;
    }

    public static FragmentSectionArticlesBinding bind(View view) {
        View g11;
        int i11 = R.id.articles;
        RecyclerView recyclerView = (RecyclerView) s2.g(view, i11);
        if (recyclerView != null) {
            i11 = R.id.label;
            MaterialTextView materialTextView = (MaterialTextView) s2.g(view, i11);
            if (materialTextView != null) {
                i11 = R.id.label_glyph;
                ImageView imageView = (ImageView) s2.g(view, i11);
                if (imageView != null) {
                    i11 = R.id.popularQuestions;
                    Group group = (Group) s2.g(view, i11);
                    if (group != null && (g11 = s2.g(view, (i11 = R.id.popularQuestions_divider))) != null) {
                        i11 = R.id.popularQuestions_list;
                        RecyclerView recyclerView2 = (RecyclerView) s2.g(view, i11);
                        if (recyclerView2 != null) {
                            i11 = R.id.popularQuestions_title;
                            MaterialTextView materialTextView2 = (MaterialTextView) s2.g(view, i11);
                            if (materialTextView2 != null) {
                                i11 = R.id.section;
                                MaterialTextView materialTextView3 = (MaterialTextView) s2.g(view, i11);
                                if (materialTextView3 != null) {
                                    return new FragmentSectionArticlesBinding((NestedScrollView) view, recyclerView, materialTextView, imageView, group, g11, recyclerView2, materialTextView2, materialTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentSectionArticlesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSectionArticlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.fragment_section_articles, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
