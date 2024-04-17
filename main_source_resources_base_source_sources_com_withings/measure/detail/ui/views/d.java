package com.withings.measure.detail.ui.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.device.details.scale.z;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
/* compiled from: AddDetailsView.kt */
/* loaded from: classes4.dex */
public final class d extends RecyclerView.z {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f41833d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f41834a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f41835b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f41836c;

    public d(View view) {
        super(view);
        this.f41834a = (ImageView) view.findViewById(C1987R.id.details_item_icon);
        this.f41835b = (TextView) view.findViewById(C1987R.id.details_item_title);
        this.f41836c = (TextView) view.findViewById(C1987R.id.details_item_desc);
    }

    public final void a(j detailsItem) {
        u.j(detailsItem, "detailsItem");
        this.f41834a.setImageResource(detailsItem.b());
        this.f41835b.setText(this.itemView.getContext().getString(detailsItem.c()));
        this.f41836c.setText(this.itemView.getContext().getString(detailsItem.a()));
        this.itemView.setOnClickListener(new z(this, 4));
    }
}
