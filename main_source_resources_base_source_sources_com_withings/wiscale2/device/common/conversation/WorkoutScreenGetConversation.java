package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.comm.wpp.generated.object.WorkoutMaxNumber;
import com.withings.comm.wpp.generated.object.WorkoutScreenList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import nm0.y;
/* compiled from: WorkoutScreenConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/WorkoutScreenGetConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutScreenGetConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final ym0.q<Integer, long[], List<? extends ImageMetadata>, y> f50787f;

    /* compiled from: WorkoutScreenConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkoutScreenGetConversation(ym0.q<? super Integer, ? super long[], ? super List<? extends ImageMetadata>, y> qVar) {
        this.f50787f = qVar;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        int a11;
        Object obj;
        WorkoutScreenList workoutScreenList;
        ImageMetadata imageMetadata;
        try {
            ?? aVar = new nj.a(x());
            aVar.c((short) 2477, new com.withings.comm.wpp.h[0]);
            aVar.j();
            List<com.withings.comm.wpp.h> d11 = aVar.D().d();
            kotlin.jvm.internal.u.i(d11, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : d11) {
                if (obj2 instanceof WorkoutMaxNumber) {
                    arrayList.add(obj2);
                }
            }
            a11 = Integer.valueOf(((WorkoutMaxNumber) x.I(arrayList)).value);
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (nm0.k.b(a11) != null) {
            a11 = 6;
        }
        int intValue = ((Number) a11).intValue();
        ?? aVar2 = new nj.a(x());
        aVar2.c((short) 315, new com.withings.comm.wpp.h[0]);
        aVar2.j();
        com.withings.comm.wpp.f D = aVar2.D();
        List<com.withings.comm.wpp.h> d12 = D.d();
        kotlin.jvm.internal.u.i(d12, "getObjects(...)");
        Iterator<T> it = d12.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.withings.comm.wpp.h) obj) instanceof WorkoutScreenList) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.withings.comm.wpp.h hVar = (com.withings.comm.wpp.h) obj;
        if (hVar != null) {
            workoutScreenList = (WorkoutScreenList) hVar;
        } else {
            workoutScreenList = new WorkoutScreenList();
        }
        List<com.withings.comm.wpp.h> d13 = D.d();
        kotlin.jvm.internal.u.i(d13, "getObjects(...)");
        ArrayList arrayList2 = new ArrayList();
        for (com.withings.comm.wpp.h hVar2 : d13) {
            if (hVar2 instanceof ImageMetadata) {
                imageMetadata = (ImageMetadata) hVar2;
            } else {
                imageMetadata = null;
            }
            if (imageMetadata != null) {
                arrayList2.add(imageMetadata);
            }
        }
        long[] screenNb = workoutScreenList.screenNb;
        kotlin.jvm.internal.u.i(screenNb, "screenNb");
        ArrayList arrayList3 = new ArrayList();
        for (long j5 : screenNb) {
            if (j5 != 0) {
                arrayList3.add(Long.valueOf(j5));
            }
        }
        this.f50787f.invoke(Integer.valueOf(intValue), x.R0(arrayList3), arrayList2);
    }

    public WorkoutScreenGetConversation(com.withings.wiscale2.device.hwa03.b bVar) {
        this.f50787f = new v(bVar);
    }
}
