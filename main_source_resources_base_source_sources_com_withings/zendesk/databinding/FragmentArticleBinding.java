package com.withings.zendesk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.camera.camera2.internal.s2;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.R;
import h9.a;
/* loaded from: classes5.dex */
public final class FragmentArticleBinding implements a {
    public final WebView article;
    public final MaterialTextView articleTitle;
    public final MaterialTextView breadcrumb;
    public final ComposeView footer;
    public final ImageView labelGlyph;
    private final NestedScrollView rootView;

    private FragmentArticleBinding(NestedScrollView nestedScrollView, WebView webView, MaterialTextView materialTextView, MaterialTextView materialTextView2, ComposeView composeView, ImageView imageView) {
        this.rootView = nestedScrollView;
        this.article = webView;
        this.articleTitle = materialTextView;
        this.breadcrumb = materialTextView2;
        this.footer = composeView;
        this.labelGlyph = imageView;
    }

    public static FragmentArticleBinding bind(View view) {
        int i11 = R.id.article;
        WebView webView = (WebView) s2.g(view, i11);
        if (webView != null) {
            i11 = R.id.article_title;
            MaterialTextView materialTextView = (MaterialTextView) s2.g(view, i11);
            if (materialTextView != null) {
                i11 = R.id.breadcrumb;
                MaterialTextView materialTextView2 = (MaterialTextView) s2.g(view, i11);
                if (materialTextView2 != null) {
                    i11 = R.id.footer;
                    ComposeView composeView = (ComposeView) s2.g(view, i11);
                    if (composeView != null) {
                        i11 = R.id.label_glyph;
                        ImageView imageView = (ImageView) s2.g(view, i11);
                        if (imageView != null) {
                            return new FragmentArticleBinding((NestedScrollView) view, webView, materialTextView, materialTextView2, composeView, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(R.layout.fragment_article, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
