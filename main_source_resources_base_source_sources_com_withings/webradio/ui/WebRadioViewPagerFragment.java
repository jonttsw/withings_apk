package com.withings.webradio.ui;

import ah.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.media3.ui.i;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.search.j;
import com.google.android.material.search.k;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.ui.VolumeSeekBar;
import com.withings.util.log.Fail;
import com.withings.views.view.CircleProgressView;
import com.withings.webradio.R;
import com.withings.webradio.WebRadios;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.ui.WebRadioAbstractFragment;
import com.withings.webradio.ui.coverflow.CoverFlowAdapter;
import com.withings.wiscale2.C1987R;
import java.util.List;
import sg.f;
/* loaded from: classes4.dex */
public class WebRadioViewPagerFragment extends Fragment implements SeekBar.OnSeekBarChangeListener, CoverFlowAdapter.CoverFlowAdapterListener {
    public static final float BIG_SCALE = 1.0f;
    private static final int DELAY_BETWEEN_TWO_SENDS = 200;
    public static final float DIFF_SCALE = 0.3f;
    private static final int PAGE_MARGIN_DP = -150;
    public static final float SMALL_SCALE = 0.7f;
    private Callback callback;
    private int currentPosition;
    private WsdProgram currentProgram;
    private WebRadio currentWebRadio;
    public ViewPager mViewPager;
    public TextView playWebradio;
    protected CircleProgressView previewCircle;
    public TextView radioName;
    public TextView radioSlogan;
    public VolumeSeekBar volumeBar;
    private List<WebRadio> webradios;
    private long lastSend = 0;
    private boolean isPlaying = false;
    private Runnable stopPreviewRunnable = new Runnable() { // from class: com.withings.webradio.ui.WebRadioViewPagerFragment.1
        {
            WebRadioViewPagerFragment.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebRadioViewPagerFragment webRadioViewPagerFragment = WebRadioViewPagerFragment.this;
            webRadioViewPagerFragment.playWebradio.setText(webRadioViewPagerFragment.getString(C1987R.string.glyph_play));
            WebRadioViewPagerFragment.this.isPlaying = false;
            WebRadioViewPagerFragment.this.previewCircle.setVisibility(4);
        }
    };

    /* loaded from: classes4.dex */
    public interface Callback extends WebRadioAbstractFragment.Callback {
        void onVolumeChanged(WebRadioViewPagerFragment webRadioViewPagerFragment, int i11);

        void onWebRadioConfirmed(WebRadioViewPagerFragment webRadioViewPagerFragment, WebRadio webRadio);

        void onWebRadioPreview(WebRadioViewPagerFragment webRadioViewPagerFragment, WebRadio webRadio);

        void stopPreview(WebRadioViewPagerFragment webRadioViewPagerFragment);
    }

    private void changeWebRadio() {
        stopPreview();
        this.isPlaying = false;
        this.currentWebRadio = this.webradios.get(this.currentPosition);
        this.mViewPager.setCurrentItem(this.currentPosition);
        setRadioInView();
    }

    public static WebRadioViewPagerFragment createInstance(Callback callback, List<WebRadio> list, WebRadio webRadio, WsdProgram wsdProgram) {
        WebRadioViewPagerFragment webRadioViewPagerFragment = new WebRadioViewPagerFragment();
        webRadioViewPagerFragment.setCallback(callback);
        webRadioViewPagerFragment.setWebradios(list);
        webRadioViewPagerFragment.setCurrentWebRadio(webRadio);
        webRadioViewPagerFragment.setCurrentProgram(wsdProgram);
        return webRadioViewPagerFragment;
    }

    public /* synthetic */ void lambda$onViewCreated$0(View view) {
        startOrStopPreview();
    }

    public /* synthetic */ void lambda$onViewCreated$1(View view) {
        onPreviousClicked();
    }

    public /* synthetic */ void lambda$onViewCreated$2(View view) {
        onNextClicked();
    }

    public /* synthetic */ void lambda$onViewCreated$3(View view) {
        onConfirmClicked();
    }

    private void sendVolume(int i11) {
        Callback callback;
        if (System.currentTimeMillis() - this.lastSend > 200 && (callback = this.callback) != null) {
            callback.onVolumeChanged(this, i11);
            this.lastSend = System.currentTimeMillis();
        }
    }

    private void setRadioInView() {
        this.radioName.setText(this.currentWebRadio.getTitle());
        this.radioSlogan.setText(this.currentWebRadio.getSlogan());
    }

    private void startOrStopPreview() {
        if (this.callback != null) {
            if (!this.isPlaying) {
                startPreview();
            } else {
                stopPreview();
            }
            this.isPlaying = !this.isPlaying;
        }
    }

    private void startPreview() {
        this.previewCircle.setProgress(0.0f);
        this.previewCircle.setVisibility(0);
        this.previewCircle.a(100.0f, WebRadios.PREVIEW_DELAY);
        this.playWebradio.setText(getString(C1987R.string.glyph_stop));
        this.callback.onWebRadioPreview(this, this.currentWebRadio);
        this.mViewPager.postDelayed(this.stopPreviewRunnable, 30000L);
    }

    private void stopPreview() {
        this.previewCircle.setVisibility(4);
        this.playWebradio.setText(getString(C1987R.string.glyph_play));
        this.callback.stopPreview(this);
        this.mViewPager.removeCallbacks(this.stopPreviewRunnable);
    }

    protected void onConfirmClicked() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.stopPreview(this);
            this.callback.onWebRadioConfirmed(this, this.currentWebRadio);
        }
    }

    @Override // com.withings.webradio.ui.coverflow.CoverFlowAdapter.CoverFlowAdapterListener
    public void onCoverScrolled(int i11) {
        this.currentWebRadio = this.webradios.get(i11);
        this.currentPosition = i11;
        setRadioInView();
        if (this.isPlaying) {
            stopPreview();
            this.isPlaying = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.findItem(R.id.search).setVisible(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_web_radio_pager, viewGroup, false);
    }

    protected void onNextClicked() {
        if (this.currentPosition < this.webradios.size() - 1) {
            this.currentPosition++;
            changeWebRadio();
        }
    }

    protected void onPreviousClicked() {
        int i11 = this.currentPosition;
        if (i11 > 0) {
            this.currentPosition = i11 - 1;
            changeWebRadio();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
        sendVolume(seekBar.getProgress());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        CoverFlowAdapter coverFlowAdapter = new CoverFlowAdapter(getChildFragmentManager(), this.webradios, this.mViewPager, this);
        int indexOf = this.webradios.indexOf(this.currentWebRadio);
        this.currentPosition = indexOf;
        if (indexOf < 0) {
            Fail.j("Current webradio is not in the webradio list ???");
        }
        this.volumeBar.setOnSeekBarChangeListener(this);
        this.volumeBar.setProgress(this.currentProgram.i());
        this.mViewPager.setAdapter(coverFlowAdapter);
        this.mViewPager.setCurrentItem(this.currentPosition);
        this.mViewPager.c(coverFlowAdapter);
        this.mViewPager.setOffscreenPageLimit(this.webradios.size());
        this.mViewPager.setClipChildren(false);
        this.mViewPager.setPageMargin(g.k(PAGE_MARGIN_DP, getContext()));
        this.previewCircle.setVisibility(4);
        this.previewCircle.setGoal(100.0f);
        this.previewCircle.setProgress(0.0f);
        setRadioInView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        stopPreview();
        this.mViewPager.removeCallbacks(this.stopPreviewRunnable);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.lastSend = 0L;
        sendVolume(seekBar.getProgress());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.radioName = (TextView) view.findViewById(R.id.radio_name);
        this.radioSlogan = (TextView) view.findViewById(R.id.radio_slogan);
        this.playWebradio = (TextView) view.findViewById(R.id.play_webradio);
        this.volumeBar = (VolumeSeekBar) view.findViewById(R.id.volume);
        this.previewCircle = (CircleProgressView) view.findViewById(R.id.previewCircleProgressView);
        this.playWebradio.setOnClickListener(new i(this, 7));
        view.findViewById(R.id.previous_webradio).setOnClickListener(new j(this, 6));
        view.findViewById(R.id.next_webradio).setOnClickListener(new k(this, 6));
        view.findViewById(R.id.confirm_webradio).setOnClickListener(new f(this, 6));
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setCurrentProgram(WsdProgram wsdProgram) {
        this.currentProgram = wsdProgram;
    }

    public void setCurrentWebRadio(WebRadio webRadio) {
        this.currentWebRadio = webRadio;
    }

    public void setWebradios(List<WebRadio> list) {
        this.webradios = list;
    }

    public void volumeDown() {
        sendVolume(this.volumeBar.b());
    }

    public void volumeUp() {
        sendVolume(this.volumeBar.c());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
