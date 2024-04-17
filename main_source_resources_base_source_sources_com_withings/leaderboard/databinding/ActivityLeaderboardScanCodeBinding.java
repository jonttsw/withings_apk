package com.withings.leaderboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.s2;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withings.leaderboard.R;
import h9.a;
/* loaded from: classes3.dex */
public final class ActivityLeaderboardScanCodeBinding implements a {
    public final Guideline guideline;
    public final PreviewView preview;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final TextView scannerText;
    public final TextView successText;
    public final Toolbar toolbar;

    private ActivityLeaderboardScanCodeBinding(ConstraintLayout constraintLayout, Guideline guideline, PreviewView previewView, ProgressBar progressBar, TextView textView, TextView textView2, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.preview = previewView;
        this.progress = progressBar;
        this.scannerText = textView;
        this.successText = textView2;
        this.toolbar = toolbar;
    }

    public static ActivityLeaderboardScanCodeBinding bind(View view) {
        int i11 = R.id.guideline;
        Guideline guideline = (Guideline) s2.g(view, i11);
        if (guideline != null) {
            i11 = R.id.preview;
            PreviewView previewView = (PreviewView) s2.g(view, i11);
            if (previewView != null) {
                i11 = R.id.progress;
                ProgressBar progressBar = (ProgressBar) s2.g(view, i11);
                if (progressBar != null) {
                    i11 = R.id.scannerText;
                    TextView textView = (TextView) s2.g(view, i11);
                    if (textView != null) {
                        i11 = R.id.successText;
                        TextView textView2 = (TextView) s2.g(view, i11);
                        if (textView2 != null) {
                            i11 = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) s2.g(view, i11);
                            if (toolbar != null) {
                                return new ActivityLeaderboardScanCodeBinding((ConstraintLayout) view, guideline, previewView, progressBar, textView, textView2, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ActivityLeaderboardScanCodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLeaderboardScanCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.activity_leaderboard_scan_code, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
