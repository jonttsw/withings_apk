package com.withings.webradio.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadioNode;
/* loaded from: classes4.dex */
public class WebRadioNodeViewHolder extends RecyclerView.z {
    private final TextView name;
    private WebRadioNode node;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onNodeClick(WebRadioNodeViewHolder webRadioNodeViewHolder, WebRadioNode webRadioNode);
    }

    public WebRadioNodeViewHolder(View view) {
        super(view);
        this.name = (TextView) view.findViewById(R.id.name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setListener$0(Listener listener, View view) {
        listener.onNodeClick(this, getNode());
    }

    public WebRadioNode getNode() {
        return this.node;
    }

    public void setListener(Listener listener) {
        if (listener == null) {
            this.itemView.setOnClickListener(null);
        } else {
            this.itemView.setOnClickListener(new a(0, this, listener));
        }
    }

    public void setNode(WebRadioNode webRadioNode) {
        this.node = webRadioNode;
        this.name.setText(webRadioNode.getTitle());
    }
}
