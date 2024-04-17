package com.withings.device.setup.ui.select.viewmodel;

import com.withings.device.setup.ui.select.uc.SetupDeviceCategory;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetupChooseDeviceViewModel.kt */
/* loaded from: classes3.dex */
public final class d extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceViewModel f37674a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<SetupDeviceCategory, List<rp.b>> f37675b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Map.Entry<SetupDeviceCategory, List<rp.b>> f37676c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ rp.b f37677d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(SetupChooseDeviceViewModel setupChooseDeviceViewModel, Map<SetupDeviceCategory, ? extends List<rp.b>> map, Map.Entry<? extends SetupDeviceCategory, ? extends List<rp.b>> entry, rp.b bVar) {
        super(1);
        this.f37674a = setupChooseDeviceViewModel;
        this.f37675b = map;
        this.f37676c = entry;
        this.f37677d = bVar;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        int intValue = num.intValue();
        MutableStateFlow<Object> m02 = this.f37674a.m0();
        Integer valueOf = Integer.valueOf(intValue);
        m02.setValue(new tp.a(this.f37675b, this.f37676c.getKey(), this.f37677d, valueOf));
        return y.f85009a;
    }
}
