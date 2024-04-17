package com.withings.webradio.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.ui.coverflow.CoverLinearLayout;
import ga.d;
import ga.f;
import ga.n;
import ha.a;
import ha.e;
import org.apache.http.HttpHost;
import w9.g;
/* loaded from: classes4.dex */
public class WebRadioSingleViewFragment extends Fragment {
    private static final int IMAGE_SIZE_PX_TO_AVOID_SLOW_APP = 200;
    private float alpha;
    private View emptyView;
    private ImageView imageView;
    private float scale;
    private WebRadio webRadio;

    public static WebRadioSingleViewFragment createInstance(WebRadio webRadio, float f11, float f12) {
        WebRadioSingleViewFragment webRadioSingleViewFragment = new WebRadioSingleViewFragment();
        webRadioSingleViewFragment.setWebRadio(webRadio);
        webRadioSingleViewFragment.setScale(f11);
        webRadioSingleViewFragment.setAlpha(f12);
        return webRadioSingleViewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideEmptyView() {
        this.emptyView.setVisibility(8);
        this.imageView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEmptyView() {
        this.emptyView.setVisibility(0);
        this.imageView.setVisibility(8);
    }

    public WebRadio getWebRadio() {
        return this.webRadio;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_web_radio_single, viewGroup, false);
        ((CoverLinearLayout) inflate.findViewById(R.id.cover_root)).setScaleBoth(this.scale, this.alpha);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.imageView = (ImageView) view.findViewById(R.id.image);
        this.emptyView = view.findViewById(R.id.empty_view);
        if (this.webRadio.getImageUrl().isEmpty()) {
            showEmptyView();
            return;
        }
        g a11 = w9.a.a(this.imageView.getContext());
        f.a aVar = new f.a(this.imageView.getContext());
        aVar.d(this.webRadio.getImageUrl().replace(HttpHost.DEFAULT_SCHEME_NAME, "https"));
        aVar.k(R.drawable.background_empty_radio_cover);
        aVar.s(new ja.a());
        aVar.o(new e(new a.C1023a(200), new a.C1023a(200)));
        aVar.q(this.imageView);
        aVar.i(new f.b() { // from class: com.withings.webradio.ui.WebRadioSingleViewFragment.1
            @Override // ga.f.b
            public void onCancel(f fVar) {
                WebRadioSingleViewFragment.this.showEmptyView();
            }

            @Override // ga.f.b
            public void onError(f fVar, d dVar) {
                WebRadioSingleViewFragment.this.showEmptyView();
            }

            @Override // ga.f.b
            public void onSuccess(f fVar, n nVar) {
                WebRadioSingleViewFragment.this.hideEmptyView();
            }

            @Override // ga.f.b
            public void onStart(f fVar) {
            }
        });
        a11.d(aVar.b());
    }

    public void setAlpha(float f11) {
        this.alpha = f11;
    }

    public void setScale(float f11) {
        this.scale = f11;
    }

    public void setWebRadio(WebRadio webRadio) {
        this.webRadio = webRadio;
    }
}
