package com.withings.webradio.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadioCategory;
import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.model.WebRadioNodeKt;
import com.withings.webradio.ui.WebRadioAbstractFragment;
import com.withings.webradio.ui.WebRadioNodeViewHolder;
/* loaded from: classes4.dex */
public class WebRadioNodeFragment extends Fragment implements WebRadioNodeViewHolder.Listener {
    private Callback callback;
    private WebRadioNode node;
    protected RecyclerView radioList;
    private WebRadioCategory webRadioCategory;

    /* loaded from: classes4.dex */
    public interface Callback extends WebRadioAbstractFragment.Callback {
        void onNodeSelected(WebRadioNodeFragment webRadioNodeFragment, WebRadioCategory webRadioCategory, WebRadioNode webRadioNode);
    }

    /* loaded from: classes4.dex */
    private class SubCategoryAdapter extends RecyclerView.Adapter<WebRadioNodeViewHolder> {
        /* synthetic */ SubCategoryAdapter(WebRadioNodeFragment webRadioNodeFragment, int i11) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return WebRadioNodeKt.getChildCount(WebRadioNodeFragment.this.node);
        }

        private SubCategoryAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(WebRadioNodeViewHolder webRadioNodeViewHolder, int i11) {
            webRadioNodeViewHolder.setNode(WebRadioNodeKt.getChildAt(WebRadioNodeFragment.this.node, i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public WebRadioNodeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
            WebRadioNodeViewHolder webRadioNodeViewHolder = new WebRadioNodeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.line_webradio_sub_category, viewGroup, false));
            webRadioNodeViewHolder.setListener(WebRadioNodeFragment.this);
            return webRadioNodeViewHolder;
        }
    }

    public static WebRadioNodeFragment createInstance(Callback callback, WebRadioCategory webRadioCategory, WebRadioNode webRadioNode) {
        WebRadioNodeFragment webRadioNodeFragment = new WebRadioNodeFragment();
        webRadioNodeFragment.setCallback(callback);
        webRadioNodeFragment.setWebRadioCategory(webRadioCategory);
        webRadioNodeFragment.setNode(webRadioNode);
        return webRadioNodeFragment;
    }

    public WebRadioNode getNode() {
        return this.node;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_wsd_webradio, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.callback = null;
    }

    @Override // com.withings.webradio.ui.WebRadioNodeViewHolder.Listener
    public void onNodeClick(WebRadioNodeViewHolder webRadioNodeViewHolder, WebRadioNode webRadioNode) {
        this.callback.onNodeSelected(this, this.webRadioCategory, webRadioNode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.webradios);
        this.radioList = recyclerView;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.radioList.setAdapter(new SubCategoryAdapter(this, 0));
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setNode(WebRadioNode webRadioNode) {
        this.node = webRadioNode;
    }

    public void setWebRadioCategory(WebRadioCategory webRadioCategory) {
        this.webRadioCategory = webRadioCategory;
    }
}
