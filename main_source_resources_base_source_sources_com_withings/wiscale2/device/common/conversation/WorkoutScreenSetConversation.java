package com.withings.wiscale2.device.common.conversation;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.comm.wpp.generated.object.Null;
import com.withings.comm.wpp.generated.object.WorkoutScreenMetadata;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutScreenConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/WorkoutScreenSetConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutScreenSetConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final WorkoutCategoryManager f50792f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f50793g;

    /* renamed from: h  reason: collision with root package name */
    private final List<ImageMetadata> f50794h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f50795i;

    /* renamed from: j  reason: collision with root package name */
    private final ra0.j f50796j;

    /* renamed from: k  reason: collision with root package name */
    private el.b f50797k;

    /* renamed from: l  reason: collision with root package name */
    private Map<Long, ? extends WorkoutCategory> f50798l;

    /* compiled from: WorkoutScreenConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<fl.o> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final fl.o invoke() {
            fl.p a11 = fl.p.f67672b.a();
            cj.b x11 = WorkoutScreenSetConversation.this.x();
            kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
            return a11.f(x11);
        }
    }

    /* compiled from: WorkoutScreenConversation.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.q<Integer, long[], List<? extends ImageMetadata>, y> {
        b() {
            super(3);
        }

        @Override // ym0.q
        public final y invoke(Integer num, long[] jArr, List<? extends ImageMetadata> list) {
            num.intValue();
            long[] screens = jArr;
            List<? extends ImageMetadata> metadata = list;
            kotlin.jvm.internal.u.j(screens, "screens");
            kotlin.jvm.internal.u.j(metadata, "metadata");
            WorkoutScreenSetConversation workoutScreenSetConversation = WorkoutScreenSetConversation.this;
            nj.a aVar = new nj.a(workoutScreenSetConversation.x());
            aVar.b(workoutScreenSetConversation.M(metadata, screens), (short) 316);
            aVar.j();
            return y.f85009a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkoutScreenSetConversation(WorkoutCategoryManager categoryManager, long[] screens, List<? extends ImageMetadata> list) {
        kotlin.jvm.internal.u.j(categoryManager, "categoryManager");
        kotlin.jvm.internal.u.j(screens, "screens");
        this.f50792f = categoryManager;
        this.f50793g = screens;
        this.f50794h = list;
        this.f50795i = nm0.h.b(new a());
        this.f50796j = new ra0.j(categoryManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList M(List list, long[] jArr) {
        nm0.j jVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Number number : kotlin.collections.l.Z(jArr)) {
            long longValue = number.longValue();
            Map<Long, ? extends WorkoutCategory> map = this.f50798l;
            if (map != null) {
                WorkoutCategory workoutCategory = map.get(Long.valueOf(longValue));
                if (workoutCategory != null) {
                    ArrayList arrayList3 = new ArrayList();
                    WorkoutScreenMetadata workoutScreenMetadata = new WorkoutScreenMetadata();
                    workoutScreenMetadata.f33286id = workoutCategory.getId();
                    workoutScreenMetadata.version = (short) 0;
                    Configuration configuration = new Configuration(r().getResources().getConfiguration());
                    configuration.setLocale(Locale.ENGLISH);
                    Context createConfigurationContext = r().createConfigurationContext(configuration);
                    Locale locale = Locale.getDefault();
                    if (!kotlin.jvm.internal.u.e(locale.getCountry(), Locale.SIMPLIFIED_CHINESE.getCountry()) && !kotlin.jvm.internal.u.e(locale.getCountry(), Locale.JAPAN.getCountry())) {
                        String language = locale.getLanguage();
                        kotlin.jvm.internal.u.i(language, "getLanguage(...)");
                        String lowerCase = language.toLowerCase(locale);
                        kotlin.jvm.internal.u.i(lowerCase, "toLowerCase(...)");
                        if (!kotlin.jvm.internal.u.e(lowerCase, "ru")) {
                            createConfigurationContext = r();
                        }
                    }
                    String name = workoutCategory.getName(createConfigurationContext);
                    boolean z5 = ((fl.o) this.f50795i.getValue()) instanceof hd0.a;
                    kotlin.jvm.internal.u.g(name);
                    if (z5) {
                        name = name.toUpperCase(locale);
                        kotlin.jvm.internal.u.i(name, "toUpperCase(...)");
                    }
                    workoutScreenMetadata.name = name;
                    workoutScreenMetadata.faceMode = (short) this.f50796j.a((int) workoutCategory.getId());
                    String[] features = workoutCategory.getFeatures();
                    kotlin.jvm.internal.u.i(features, "getFeatures(...)");
                    workoutScreenMetadata.flag = !kotlin.collections.l.m(features, ConstantsWs.SUBCATEGORY_FEATURE_WAKE_SMARTPHONE_UP) ? 1 : 0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ImageMetadata imageMetadata = (ImageMetadata) it.next();
                        Drawable drawable = androidx.core.content.a.getDrawable(r(), workoutCategory.getGlyphRes());
                        if (this.f50797k != null) {
                            short s11 = imageMetadata.width;
                            short s12 = imageMetadata.height;
                            Bitmap createBitmap = Bitmap.createBitmap(s11, s12, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            androidx.core.graphics.drawable.a.l(drawable, -1);
                            drawable.setBounds(0, 0, s11, s12);
                            drawable.draw(canvas);
                            el.a a11 = el.b.a(createBitmap);
                            ImageMetadata imageMetadata2 = new ImageMetadata();
                            imageMetadata2.type = imageMetadata.type;
                            imageMetadata2.width = a11.f65612a;
                            imageMetadata2.height = a11.f65613b;
                            byte[] bArr = a11.f65614c;
                            byte[] bArr2 = new byte[bArr.length];
                            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                            arrayList3.add(new nm0.j(imageMetadata2, ah.g.z(bArr2)));
                        } else {
                            kotlin.jvm.internal.u.s("deviceImageFactory");
                            throw null;
                        }
                    }
                    jVar = new nm0.j(workoutScreenMetadata, arrayList3);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList2.add(jVar);
                }
            } else {
                kotlin.jvm.internal.u.s("categoryMap");
                throw null;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            nm0.j jVar2 = (nm0.j) it2.next();
            arrayList.add((WorkoutScreenMetadata) jVar2.a());
            for (nm0.j jVar3 : (List) jVar2.b()) {
                arrayList.add(jVar3.c());
                arrayList.addAll((Collection) jVar3.d());
            }
        }
        arrayList.add(new Null());
        return arrayList;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Map<Long, WorkoutCategory> allCategory = this.f50792f.getAllCategory();
        kotlin.jvm.internal.u.i(allCategory, "getAllCategory(...)");
        this.f50798l = allCategory;
        this.f50797k = new el.b(r());
        List<ImageMetadata> list = this.f50794h;
        if (list != null) {
            nj.a aVar = new nj.a(x());
            aVar.b(M(list, this.f50793g), (short) 316);
            aVar.j();
            return;
        }
        E(new WorkoutScreenGetConversation(new b()));
    }
}
