package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.enrolled.EnrolledIteration;
import com.withings.programs.model.enrolledprogram.Menu;
import com.withings.programs.model.program.DurationDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import com.withings.wiscale2.legacyprograms.WellnessProgramWebActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import x30.j;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$getProgramUrlAndOpen$2", f = "WellnessProgramJoiner.kt", l = {ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner$getProgramUrlAndOpen$2 extends i implements p<CoroutineScope, qm0.d<? super Intent>, Object> {
    final /* synthetic */ int $programId;
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$getProgramUrlAndOpen$2(WellnessProgramJoiner wellnessProgramJoiner, int i11, qm0.d<? super WellnessProgramJoiner$getProgramUrlAndOpen$2> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramJoiner;
        this.$programId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramJoiner$getProgramUrlAndOpen$2(this.this$0, this.$programId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        User user;
        String str;
        Context context;
        User user2;
        EnrolledIteration enrolledIteration;
        String str2;
        String str3;
        Integer num;
        String str4;
        Menu menu;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            jVar = this.this$0.getProgramByIdUseCase;
            user = this.this$0.user;
            x30.i a11 = jVar.a(user.q(), this.$programId, false);
            this.label = 1;
            obj = FlowKt.first(a11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ProgramDomain programDomain = (ProgramDomain) obj;
        if (programDomain != null) {
            if (programDomain.getTargetType() == 2) {
                str2 = programDomain.getTargetValue();
            } else {
                List<EnrolledIteration> iterations = programDomain.getEnrolled().getIterations();
                if (iterations != null) {
                    Iterator<T> it = iterations.iterator();
                    if (!it.hasNext()) {
                        next = null;
                    } else {
                        next = it.next();
                        if (it.hasNext()) {
                            long start = ((EnrolledIteration) next).getStart();
                            do {
                                Object next2 = it.next();
                                long start2 = ((EnrolledIteration) next2).getStart();
                                if (start < start2) {
                                    next = next2;
                                    start = start2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    enrolledIteration = (EnrolledIteration) next;
                } else {
                    enrolledIteration = null;
                }
                if (enrolledIteration != null) {
                    List<Menu> menu2 = enrolledIteration.getMenu();
                    if (menu2 != null && (menu = menu2.get(0)) != null) {
                        str3 = menu.getUrl();
                    } else {
                        str3 = null;
                    }
                    Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                    if (enrolledIteration.getProgramSwToken() != null) {
                        buildUpon.appendQueryParameter(DynamicLink.Builder.KEY_API_KEY, enrolledIteration.getProgramSwToken());
                    }
                    DateTime dateTime = new DateTime(enrolledIteration.getStart());
                    Integer progress = enrolledIteration.getProgress();
                    if (programDomain.getTargetType() == 3 && progress != null) {
                        ProgramDomain.LegacyDomain legacyDomain = (ProgramDomain.LegacyDomain) programDomain;
                        DurationDomain durationJson = legacyDomain.getDurationJson();
                        if (durationJson != null) {
                            int value = durationJson.getValue();
                            buildUpon.appendQueryParameter("progress", String.valueOf((int) Math.ceil((progress.intValue() * value) / 100.0f)));
                            if (value != 2) {
                                if (value != 3) {
                                    if (value != 4) {
                                        str4 = ConstantsWs.RANGESTR_DAYS;
                                    } else {
                                        str4 = ConstantsWs.RANGESTR_YEARS;
                                    }
                                } else {
                                    str4 = ConstantsWs.RANGESTR_MONTHS;
                                }
                            } else {
                                str4 = ConstantsWs.RANGESTR_WEEKS;
                            }
                            buildUpon.appendQueryParameter("durationtype", str4);
                        }
                        buildUpon.appendQueryParameter("startdate", dateTime.toString("yyyy-MM-dd"));
                        DurationDomain durationJson2 = legacyDomain.getDurationJson();
                        if (durationJson2 != null) {
                            num = Integer.valueOf(durationJson2.getValue());
                        } else {
                            num = null;
                        }
                        buildUpon.appendQueryParameter("duration", String.valueOf(num));
                    }
                    str2 = buildUpon.build().toString();
                } else {
                    str2 = null;
                }
            }
            str = str2;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        WellnessProgramJoiner wellnessProgramJoiner = this.this$0;
        int i12 = this.$programId;
        WellnessProgramWebActivity.Companion companion = WellnessProgramWebActivity.Companion;
        context = wellnessProgramJoiner.context;
        user2 = wellnessProgramJoiner.user;
        return companion.createIntent(context, user2.q(), i12, str);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Intent> dVar) {
        return ((WellnessProgramJoiner$getProgramUrlAndOpen$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
