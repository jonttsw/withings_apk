package com.withings.wiscale2.device.common.feature;

import android.content.Context;
import com.withings.common.device.conversation.FeatureTagsConversation;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.w;
/* compiled from: PlatformFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class v implements PlatformFeatureRepository.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f52607a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f52608b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f52609c;

    /* compiled from: PlatformFeatureDelegate.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<kn.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f52610a = new w(0);

        @Override // ym0.a
        public final kn.e invoke() {
            return kn.e.c();
        }
    }

    /* compiled from: PlatformFeatureDelegate.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<ej.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f52611a = new w(0);

        @Override // ym0.a
        public final ej.w invoke() {
            return ej.w.w();
        }
    }

    public v(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f52607a = context;
        this.f52608b = nm0.h.b(a.f52610a);
        this.f52609c = nm0.h.b(b.f52611a);
    }

    private final void a(PlatformFeature platformFeature) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : platformFeature.getOwners()) {
            if (obj instanceof DeviceOwner) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long deviceId = ((DeviceOwner) it.next()).getDeviceId();
            if (deviceId != null) {
                arrayList2.add(deviceId);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Device d11 = ((kn.e) this.f52608b.getValue()).d(((Number) it2.next()).longValue());
            kotlin.jvm.internal.u.g(d11);
            nm0.g gVar = this.f52609c;
            cj.b D = ((ej.w) gVar.getValue()).D(d11.getMacAddress());
            if (D != null && D.n()) {
                Context context = this.f52607a;
                kotlin.jvm.internal.u.j(context, "context");
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                FeatureTagsConversation.a aVar = (FeatureTagsConversation.a) ah.o.c(applicationContext, FeatureTagsConversation.a.class);
                FeatureTagsConversation featureTagsConversation = new FeatureTagsConversation(aVar.a(), aVar.g());
                cj.d b10 = jl.a.b(d11);
                ej.w wVar = (ej.w) gVar.getValue();
                wVar.getClass();
                wVar.u(b10, featureTagsConversation, FeatureTagsConversation.class).r();
            }
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository.Listener
    public final void onFeatureDeleted(PlatformFeature feature) {
        kotlin.jvm.internal.u.j(feature, "feature");
        a(feature);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository.Listener
    public final void onFeatureInserted(PlatformFeature feature) {
        kotlin.jvm.internal.u.j(feature, "feature");
        a(feature);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository.Listener
    public final void onFeatureUpdated(PlatformFeature feature) {
        kotlin.jvm.internal.u.j(feature, "feature");
        a(feature);
    }
}
