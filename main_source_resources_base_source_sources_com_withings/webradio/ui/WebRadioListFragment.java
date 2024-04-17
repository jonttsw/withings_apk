package com.withings.webradio.ui;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.util.log.Fail;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.model.WebRadioCategory;
import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.network.GetWebRadios;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import com.withings.webradio.ui.WebRadioAbstractFragment;
import com.withings.webradio.ui.WsdWebRadioViewHolder;
import com.withings.webservices.legacy.WsFailer;
import com.withings.webservices.legacy.common.exception.ComeBackLaterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import vh.h;
import vh.o;
/* loaded from: classes4.dex */
public class WebRadioListFragment extends Hilt_WebRadioListFragment implements WsdWebRadioViewHolder.Listener {
    private RadioAdapter adapter;
    private Callback callback;
    private Location lastKnownLocation;
    private View loadingView;
    private RecyclerView radioList;
    @Inject
    WebRadiosRemoteRepository webRadiosRemoteRepository;
    private final List<WebRadio> webradios = new ArrayList();
    private boolean isLoadingMoreRadios = false;
    private boolean hasLoadedAllWebRadios = false;

    /* loaded from: classes4.dex */
    public interface Callback extends WebRadioAbstractFragment.Callback {
        void onWebRadioSelected(WebRadioListFragment webRadioListFragment, WebRadio webRadio, List<WebRadio> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class RadioAdapter extends RecyclerView.Adapter<RecyclerView.z> {
        private static final int VIEW_ITEM = 0;
        private static final int VIEW_LOAD = 1;

        /* loaded from: classes4.dex */
        public class ProgressViewHolder extends RecyclerView.z {
            public ProgressViewHolder(View view) {
                super(view);
            }
        }

        /* synthetic */ RadioAdapter(WebRadioListFragment webRadioListFragment, int i11) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return WebRadioListFragment.this.webradios.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i11) {
            if (WebRadioListFragment.this.webradios.get(i11) != null) {
                return 0;
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.z zVar, int i11) {
            if (zVar instanceof WsdWebRadioViewHolder) {
                ((WsdWebRadioViewHolder) zVar).setWebRadio((WebRadio) WebRadioListFragment.this.webradios.get(i11));
            }
            if (i11 == WebRadioListFragment.this.webradios.size() - 10) {
                WebRadioListFragment.this.getMoreWebRadios();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.z onCreateViewHolder(ViewGroup viewGroup, int i11) {
            RecyclerView.z zVar;
            if (i11 != 0) {
                if (i11 != 1) {
                    Fail.j("View type : " + i11 + " is not handled !");
                    return null;
                }
                zVar = new ProgressViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_web_radio_load, viewGroup, false));
            } else {
                WsdWebRadioViewHolder wsdWebRadioViewHolder = new WsdWebRadioViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_web_radio_list, viewGroup, false));
                wsdWebRadioViewHolder.setListener(WebRadioListFragment.this);
                zVar = wsdWebRadioViewHolder;
            }
            return zVar;
        }

        private RadioAdapter() {
        }
    }

    private void addLoadingView() {
        this.webradios.add(null);
    }

    public static WebRadioListFragment createInstance(Callback callback, WebRadioCategory webRadioCategory, WebRadioNode webRadioNode, Location location) {
        WebRadioListFragment webRadioListFragment = new WebRadioListFragment();
        webRadioListFragment.setCallback(callback);
        webRadioListFragment.setCategory(webRadioCategory);
        webRadioListFragment.setLastKnownLocation(location);
        webRadioListFragment.setNode(webRadioNode);
        return webRadioListFragment;
    }

    private void getDataSilently() {
        x70.b.r(this, "Get webradios for %s/%s", getString(this.webRadioCategory.getNameId()), this.node.getTitle());
        o c11 = h.l().c(new GetWebRadios(this.webRadiosRemoteRepository, this.webRadioCategory, this.node, this.lastKnownLocation, this.currentOffset));
        c11.q(new WsFailer.CallCallback<List<? extends WebRadio>>() { // from class: com.withings.webradio.ui.WebRadioListFragment.1
            @Override // com.withings.webservices.legacy.WsFailer.CallCallback, vh.p
            public void onError(Exception exc) {
                if (exc instanceof ComeBackLaterException) {
                    WebRadioListFragment.this.onComeBackLater(((ComeBackLaterException) exc).getSecondsToWait());
                    return;
                }
                super.onError(exc);
                WebRadioListFragment.this.onFailedToGetDatas();
            }

            @Override // com.withings.webservices.legacy.WsFailer.CallCallback, vh.m.b
            public void onResult(List<? extends WebRadio> list) {
                WebRadioListFragment.this.onWebRadioFound(list);
            }
        });
        c11.p(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMoreWebRadios() {
        if (!this.isLoadingMoreRadios && !this.hasLoadedAllWebRadios) {
            this.isLoadingMoreRadios = true;
            x70.b.r(this, String.format("Get more webradio : offset = %d", Integer.valueOf(this.currentOffset)), new Object[0]);
            this.currentOffset += 50;
            getDataSilently();
        }
    }

    private void removeLoadingView() {
        this.webradios.removeAll(Collections.singleton(null));
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment
    protected void getDatas() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onDataLoading(this);
        }
        getDataSilently();
        this.loadingView.setVisibility(0);
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment
    protected void notifyNothingToDisplay() {
        this.loadingView.setVisibility(8);
        if (!this.webradios.isEmpty()) {
            removeLoadingView();
            update();
            return;
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onNothingToDisplay(this);
        }
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment
    protected void onConnexionError() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onFailToGetDatas(this);
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
        menu.findItem(R.id.search).setVisible(true);
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment
    public void onDataNeedsWaiting(int i11) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onDataNeedsWaiting(this, i11);
        }
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.callback = null;
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.radioList = (RecyclerView) view.findViewById(R.id.webradios);
        this.loadingView = view.findViewById(R.id.loading);
        RecyclerView recyclerView = this.radioList;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RadioAdapter radioAdapter = new RadioAdapter(this, 0);
        this.adapter = radioAdapter;
        this.radioList.setAdapter(radioAdapter);
        super.onViewCreated(view, bundle);
    }

    @Override // com.withings.webradio.ui.WsdWebRadioViewHolder.Listener
    public void onWebRadioClicked(WsdWebRadioViewHolder wsdWebRadioViewHolder, WebRadio webRadio) {
        removeLoadingView();
        this.callback.onWebRadioSelected(this, webRadio, this.webradios);
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment
    public void onWebRadioFound(List<WebRadio> list) {
        super.onWebRadioFound(list);
        removeLoadingView();
        this.loadingView.setVisibility(8);
        if (!list.isEmpty()) {
            Callback callback = this.callback;
            if (callback != null) {
                callback.onDataLoaded(this);
            }
            this.webradios.addAll(list);
            if (this.webradios.size() > 10) {
                addLoadingView();
            }
        } else if (!this.webradios.isEmpty()) {
            this.hasLoadedAllWebRadios = true;
        } else {
            notifyNothingToDisplay();
            return;
        }
        update();
        this.isLoadingMoreRadios = false;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setLastKnownLocation(Location location) {
        this.lastKnownLocation = location;
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment
    protected void update() {
        if (this.radioList != null && !this.webradios.isEmpty()) {
            this.adapter.notifyDataSetChanged();
        }
    }
}
