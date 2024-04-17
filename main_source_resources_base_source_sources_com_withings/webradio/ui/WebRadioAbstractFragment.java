package com.withings.webradio.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.model.WebRadioCategory;
import com.withings.webradio.model.WebRadioNode;
import com.withings.wiscale2.C1987R;
import java.util.List;
import vh.h;
/* loaded from: classes4.dex */
public abstract class WebRadioAbstractFragment extends Fragment {
    private static final int MAX_NUMBER_OF_TRIES_TO_GET_DATAS = 3;
    public static final int NUMBER_OF_RADIOS_TO_LOAD = 50;
    protected static final int OFFSET_BEFORE_LOADING_NEXT = 10;
    protected WebRadioNode node;
    protected WebRadioCategory webRadioCategory;
    protected Handler callAgainHandler = new Handler(Looper.getMainLooper());
    protected int currentOffset = 0;
    protected Runnable callAgainRunnable = new Runnable() { // from class: com.withings.webradio.ui.WebRadioAbstractFragment.1
        @Override // java.lang.Runnable
        public void run() {
            WebRadioAbstractFragment.this.getDatas();
        }
    };
    private int numberOfTriesToGetData = 0;

    /* loaded from: classes4.dex */
    public interface Callback {
        void onDataLoaded(WebRadioAbstractFragment webRadioAbstractFragment);

        void onDataLoading(WebRadioAbstractFragment webRadioAbstractFragment);

        void onDataNeedsWaiting(WebRadioAbstractFragment webRadioAbstractFragment, int i11);

        void onFailToGetDatas(WebRadioAbstractFragment webRadioAbstractFragment);

        void onNothingToDisplay(WebRadioAbstractFragment webRadioAbstractFragment);
    }

    protected abstract void getDatas();

    protected abstract void notifyNothingToDisplay();

    public void onComeBackLater(int i11) {
        x70.b.r(this, "Webservice asked us to wait for %d seconds", Integer.valueOf(i11));
        int i12 = this.numberOfTriesToGetData + 1;
        this.numberOfTriesToGetData = i12;
        if (i12 > 3) {
            x70.b.r(this, "Too many tries to connect to platform", new Object[0]);
            notifyNothingToDisplay();
            return;
        }
        this.callAgainHandler.postDelayed(this.callAgainRunnable, i11 * 1000);
        onDataNeedsWaiting(i11);
    }

    protected abstract void onConnexionError();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_wsd_webradio, viewGroup, false);
    }

    protected abstract void onDataNeedsWaiting(int i11);

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        h.b(this);
        this.callAgainHandler.removeCallbacks(this.callAgainRunnable);
        super.onDetach();
    }

    public void onFailedToGetDatas() {
        Toast.makeText(getActivity(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 1).show();
        onConnexionError();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        update();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getDatas();
    }

    public void onWebRadioFound(List<WebRadio> list) {
        this.numberOfTriesToGetData = 0;
    }

    public void setCategory(WebRadioCategory webRadioCategory) {
        this.webRadioCategory = webRadioCategory;
    }

    public void setNode(WebRadioNode webRadioNode) {
        this.node = webRadioNode;
    }

    protected abstract void update();
}
