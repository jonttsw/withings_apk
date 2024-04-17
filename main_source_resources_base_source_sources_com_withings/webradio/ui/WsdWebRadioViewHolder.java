package com.withings.webradio.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadio;
import ga.f;
import org.apache.http.HttpHost;
/* loaded from: classes4.dex */
public class WsdWebRadioViewHolder extends RecyclerView.z {
    private final ImageView radioImage;
    private final TextView slogan;
    private final TextView title;
    private WebRadio webRadio;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onWebRadioClicked(WsdWebRadioViewHolder wsdWebRadioViewHolder, WebRadio webRadio);
    }

    public WsdWebRadioViewHolder(View view) {
        super(view);
        this.title = (TextView) view.findViewById(R.id.title);
        this.slogan = (TextView) view.findViewById(R.id.slogan);
        this.radioImage = (ImageView) view.findViewById(R.id.radio_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setListener$0(Listener listener, View view) {
        listener.onWebRadioClicked(this, this.webRadio);
    }

    public WebRadio getWebRadio() {
        return this.webRadio;
    }

    public void setListener(Listener listener) {
        this.itemView.setOnClickListener(new b(0, this, listener));
    }

    public void setWebRadio(WebRadio webRadio) {
        boolean z5;
        int i11;
        this.webRadio = webRadio;
        this.title.setText(webRadio.getTitle());
        if (webRadio.getSlogan() != null && !webRadio.getSlogan().isEmpty()) {
            z5 = true;
        } else {
            z5 = false;
        }
        TextView textView = this.slogan;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (z5) {
            this.slogan.setText(webRadio.getSlogan());
        }
        Context context = this.itemView.getContext();
        f.a aVar = new f.a(context);
        aVar.k(R.drawable.background_empty_radio_list);
        aVar.s(new ja.a());
        aVar.d(webRadio.getImageUrl().replace(HttpHost.DEFAULT_SCHEME_NAME, "https"));
        aVar.q(this.radioImage);
        w9.a.a(context).d(aVar.b());
    }
}
