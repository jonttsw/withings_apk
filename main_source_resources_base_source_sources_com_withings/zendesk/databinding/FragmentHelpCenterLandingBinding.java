package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.s2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.withings.views.view.SectionView;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class FragmentHelpCenterLandingBinding implements a {
    public final ImageView backgroundHeader;
    public final ConstraintLayout constraintLayout;
    public final Group labelViews;
    public final RecyclerView labels;
    public final NestedScrollView nestedScrollView;
    public final Group popularQuestions;
    public final View popularQuestionsDivider;
    public final RecyclerView popularQuestionsList;
    public final MaterialTextView popularQuestionsTitle;
    public final MaterialButton productDetail;
    public final ImageView productImage;
    public final TextView productInfo;
    public final TextView productName;
    private final NestedScrollView rootView;
    public final SectionView sectionLabels;

    private FragmentHelpCenterLandingBinding(NestedScrollView nestedScrollView, ImageView imageView, ConstraintLayout constraintLayout, Group group, RecyclerView recyclerView, NestedScrollView nestedScrollView2, Group group2, View view, RecyclerView recyclerView2, MaterialTextView materialTextView, MaterialButton materialButton, ImageView imageView2, TextView textView, TextView textView2, SectionView sectionView) {
        this.rootView = nestedScrollView;
        this.backgroundHeader = imageView;
        this.constraintLayout = constraintLayout;
        this.labelViews = group;
        this.labels = recyclerView;
        this.nestedScrollView = nestedScrollView2;
        this.popularQuestions = group2;
        this.popularQuestionsDivider = view;
        this.popularQuestionsList = recyclerView2;
        this.popularQuestionsTitle = materialTextView;
        this.productDetail = materialButton;
        this.productImage = imageView2;
        this.productInfo = textView;
        this.productName = textView2;
        this.sectionLabels = sectionView;
    }

    public static FragmentHelpCenterLandingBinding bind(View view) {
        View g11;
        int i11 = R.id.background_header;
        ImageView imageView = (ImageView) s2.g(view, i11);
        if (imageView != null) {
            i11 = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) s2.g(view, i11);
            if (constraintLayout != null) {
                i11 = R.id.labelViews;
                Group group = (Group) s2.g(view, i11);
                if (group != null) {
                    i11 = R.id.labels;
                    RecyclerView recyclerView = (RecyclerView) s2.g(view, i11);
                    if (recyclerView != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        i11 = R.id.popularQuestions;
                        Group group2 = (Group) s2.g(view, i11);
                        if (group2 != null && (g11 = s2.g(view, (i11 = R.id.popularQuestions_divider))) != null) {
                            i11 = R.id.popularQuestions_list;
                            RecyclerView recyclerView2 = (RecyclerView) s2.g(view, i11);
                            if (recyclerView2 != null) {
                                i11 = R.id.popularQuestions_title;
                                MaterialTextView materialTextView = (MaterialTextView) s2.g(view, i11);
                                if (materialTextView != null) {
                                    i11 = R.id.product_detail;
                                    MaterialButton materialButton = (MaterialButton) s2.g(view, i11);
                                    if (materialButton != null) {
                                        i11 = R.id.product_image;
                                        ImageView imageView2 = (ImageView) s2.g(view, i11);
                                        if (imageView2 != null) {
                                            i11 = R.id.product_info;
                                            TextView textView = (TextView) s2.g(view, i11);
                                            if (textView != null) {
                                                i11 = R.id.product_name;
                                                TextView textView2 = (TextView) s2.g(view, i11);
                                                if (textView2 != null) {
                                                    i11 = R.id.section_labels;
                                                    SectionView sectionView = (SectionView) s2.g(view, i11);
                                                    if (sectionView != null) {
                                                        return new FragmentHelpCenterLandingBinding(nestedScrollView, imageView, constraintLayout, group, recyclerView, nestedScrollView, group2, g11, recyclerView2, materialTextView, materialButton, imageView2, textView, textView2, sectionView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentHelpCenterLandingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHelpCenterLandingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.fragment_help_center_landing, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
