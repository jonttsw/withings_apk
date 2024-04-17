package com.withings.wiscale2.legacyprograms;

import com.withings.device.Device;
import com.withings.programs.model.program.DeviceDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.program.SpecificsDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "program", "", "Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "invoke", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailViewModel$programDevices$1 extends w implements l<ProgramDomain.LegacyDomain, List<ProgramDeviceContainer>> {
    final /* synthetic */ WellnessProgramDetailViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailViewModel$programDevices$1(WellnessProgramDetailViewModel wellnessProgramDetailViewModel) {
        super(1);
        this.this$0 = wellnessProgramDetailViewModel;
    }

    @Override // ym0.l
    public final List<ProgramDeviceContainer> invoke(ProgramDomain.LegacyDomain legacyDomain) {
        SpecificsDomain specifics;
        List<DeviceDomain> devices;
        List list;
        if (legacyDomain == null || (specifics = legacyDomain.getSpecifics()) == null || (devices = specifics.getDevices()) == null) {
            return null;
        }
        List<DeviceDomain> list2 = devices;
        WellnessProgramDetailViewModel wellnessProgramDetailViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (DeviceDomain deviceDomain : list2) {
            ProgramDeviceContainer programDeviceContainer = new ProgramDeviceContainer();
            list = wellnessProgramDetailViewModel.allDevices;
            u.i(list, "access$getAllDevices$p(...)");
            List list3 = list;
            boolean z5 = false;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Device) it.next()).getModelId() == deviceDomain.getModel()) {
                            z5 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            programDeviceContainer.setHasDevice(z5);
            programDeviceContainer.setProgramDevice(deviceDomain);
            arrayList.add(programDeviceContainer);
        }
        return arrayList;
    }
}
