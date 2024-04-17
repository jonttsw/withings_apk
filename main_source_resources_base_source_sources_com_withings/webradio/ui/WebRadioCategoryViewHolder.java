package com.withings.webradio.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadioCategory;
/* loaded from: classes4.dex */
public class WebRadioCategoryViewHolder extends RecyclerView.z {
    private WebRadioCategory category;
    private Listener listener;
    private TextView name;
    private View view;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onCategoryClick(WebRadioCategoryViewHolder webRadioCategoryViewHolder, WebRadioCategory webRadioCategory);
    }

    public WebRadioCategoryViewHolder(View view) {
        super(view);
        this.view = view;
        this.name = (TextView) view.findViewById(R.id.name);
    }

    public static /* synthetic */ void a(WebRadioCategoryViewHolder webRadioCategoryViewHolder, Listener listener, View view) {
        webRadioCategoryViewHolder.lambda$setListener$0(listener, view);
    }

    public /* synthetic */ void lambda$setListener$0(Listener listener, View view) {
        listener.onCategoryClick(this, getCategory());
    }

    public WebRadioCategory getCategory() {
        return this.category;
    }

    public Listener getListener() {
        return this.listener;
    }

    public void setCategory(WebRadioCategory webRadioCategory) {
        this.category = webRadioCategory;
        this.name.setText(webRadioCategory.getNameId());
    }

    public void setListener(Listener listener) {
        this.listener = listener;
        this.view.setOnClickListener(new uk.a(1, this, listener));
    }
}
