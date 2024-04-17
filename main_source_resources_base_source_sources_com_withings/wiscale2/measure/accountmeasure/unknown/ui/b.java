package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.a;
import jm.a;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import un.n;
/* compiled from: UnknownMeasureAdapter.kt */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.z {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f58342e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final View f58343a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f58344b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f58345c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f58346d;

    public b(View view) {
        super(view);
        this.f58343a = view;
        this.f58344b = (TextView) view.findViewById(C1987R.id.time);
        this.f58345c = (TextView) view.findViewById(C1987R.id.value);
        this.f58346d = (ImageView) view.findViewById(C1987R.id.check);
    }

    public final void a(jh0.d dVar, a.InterfaceC0754a callback) {
        double d11;
        u.j(callback, "callback");
        Measure measureForType = dVar.b().getMeasureForType(dVar.a());
        if (measureForType != null) {
            d11 = measureForType.f95794y;
        } else {
            d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        double d12 = d11;
        View view = this.f58343a;
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        this.f58345c.setText(jm.a.c(a.d.a(context), dVar.a(), d12, 0, 0, 60));
        DateTime dateTime = new DateTime(dVar.b().getDate().getTime());
        Context context2 = this.itemView.getContext();
        u.i(context2, "getContext(...)");
        this.f58344b.setText(b50.b.m(dateTime, context2, false, 6));
        this.f58346d.setSelected(dVar.c());
        view.setOnClickListener(new n(6, dVar, callback));
    }
}
