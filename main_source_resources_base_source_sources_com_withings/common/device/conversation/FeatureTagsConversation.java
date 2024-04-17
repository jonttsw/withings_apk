package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.FeatureTags;
import com.withings.comm.wpp.generated.object.Id;
import com.withings.comm.wpp.generated.object.Null;
import ep0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.time.DurationUnit;
import nm0.j;
import org.joda.time.Instant;
import ur.a;
/* compiled from: FeatureTagsConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/common/device/conversation/FeatureTagsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FeatureTagsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f35133f;

    /* renamed from: g  reason: collision with root package name */
    private final vr.d f35134g;

    /* compiled from: FeatureTagsConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/common/device/conversation/FeatureTagsConversation$a;", "", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface a {
        kn.e a();

        vr.d g();
    }

    public FeatureTagsConversation(kn.e deviceManager, vr.d featureTagsRepository) {
        u.j(deviceManager, "deviceManager");
        u.j(featureTagsRepository, "featureTagsRepository");
        this.f35133f = deviceManager;
        this.f35134g = featureTagsRepository;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Iterable iterable;
        long j5;
        long j11;
        List<ur.a> b10 = tr.a.b(this.f35134g, this.f35133f.f(x().g()).getId());
        if (!b10.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ur.a aVar : b10) {
                Object obj = linkedHashMap.get(0L);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(0L, obj);
                }
                ((List) obj).add(new j(Integer.valueOf(aVar.c()), aVar.a()));
                for (Map.Entry<Long, a.C1727a> entry : aVar.d().entrySet()) {
                    long longValue = entry.getKey().longValue();
                    a.C1727a value = entry.getValue();
                    Long valueOf = Long.valueOf(longValue);
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    ((List) obj2).add(new j(Integer.valueOf(aVar.c()), value));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                long longValue2 = ((Number) entry2.getKey()).longValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (List) entry2.getValue()) {
                    if (((a.C1727a) ((j) obj3).b()).a()) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    int intValue = ((Number) jVar.a()).intValue();
                    a.C1727a c1727a = (a.C1727a) jVar.b();
                    FeatureTags featureTags = new FeatureTags();
                    featureTags.f33250id = intValue;
                    Instant d11 = c1727a.d();
                    if (d11 != null) {
                        long millis = d11.getMillis();
                        a.C0892a c0892a = ep0.a.f65838b;
                        j5 = ep0.a.q(ep0.c.k(millis, DurationUnit.f78023c), DurationUnit.f78024d);
                    } else {
                        j5 = 0;
                    }
                    featureTags.startTime = j5;
                    Instant b11 = c1727a.b();
                    if (b11 != null) {
                        long millis2 = b11.getMillis();
                        a.C0892a c0892a2 = ep0.a.f65838b;
                        j11 = ep0.a.q(ep0.c.k(millis2, DurationUnit.f78023c), DurationUnit.f78024d);
                    } else {
                        j11 = 0;
                    }
                    featureTags.endTime = j11;
                    arrayList3.add(featureTags);
                }
                if (!arrayList3.isEmpty()) {
                    iterable = x.l0(arrayList3, x.V(new Id().setValue(longValue2)));
                } else {
                    iterable = i0.f76187a;
                }
                x.n(iterable, arrayList);
            }
            ArrayList m02 = x.m0(new Null(), arrayList);
            try {
                nj.a aVar2 = new nj.a(x());
                aVar2.b(m02, (short) 2439);
                aVar2.j();
            } catch (UnsupportedCommandException unused) {
                x70.b.t(this, "Command CMD_FEATURE_TAGS_SET is not supported by " + x().g() + " with firmware " + x().i().softVersion, new Object[0]);
            }
        }
    }
}
