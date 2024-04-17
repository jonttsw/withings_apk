package com.withings.wiscale2.legacyprograms;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.f;
import androidx.lifecycle.h1;
import androidx.lifecycle.q;
import com.withings.device.Device;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.FeatureDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.program.ScreenshotDomain;
import com.withings.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import x30.j;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R%\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00130\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R8\u0010 \u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R%\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00130\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012¨\u0006-"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramDetailViewModel;", "Landroidx/lifecycle/b;", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "wellnessProgram", "Lnm0/y;", "joinProgram", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "getUser", "()Lcom/withings/user/User;", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;", "wellnessProgramJoiner", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getWellnessProgram", "()Landroidx/lifecycle/LiveData;", "", "Lcom/withings/programs/model/program/FeatureDomain;", "features", "getFeatures", "Lcom/withings/programs/model/program/ScreenshotDomain;", "screenshots", "getScreenshots", "", "deviceSectionTitle", "getDeviceSectionTitle", "", "Lcom/withings/device/Device;", "kotlin.jvm.PlatformType", "allDevices", "Ljava/util/List;", "Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "programDevices", "getProgramDevices", "Landroid/app/Application;", "application", "", NavigationArguments.PROGRAM_ID, "Lx30/j;", "getProgramByIdUseCase", "<init>", "(Landroid/app/Application;Lcom/withings/user/User;ILx30/j;Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailViewModel extends androidx.lifecycle.b {
    public static final int $stable = 8;
    private final List<Device> allDevices;
    private final LiveData<String> deviceSectionTitle;
    private final LiveData<List<FeatureDomain>> features;
    private final LiveData<List<ProgramDeviceContainer>> programDevices;
    private final LiveData<List<ScreenshotDomain>> screenshots;
    private final User user;
    private final LiveData<ProgramDomain.LegacyDomain> wellnessProgram;
    private final WellnessProgramJoiner wellnessProgramJoiner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailViewModel(Application application, User user, int i11, j getProgramByIdUseCase, WellnessProgramJoiner wellnessProgramJoiner) {
        super(application);
        u.j(application, "application");
        u.j(user, "user");
        u.j(getProgramByIdUseCase, "getProgramByIdUseCase");
        u.j(wellnessProgramJoiner, "wellnessProgramJoiner");
        this.user = user;
        this.wellnessProgramJoiner = wellnessProgramJoiner;
        f b10 = q.b(getProgramByIdUseCase.a(user.q(), i11, false), Dispatchers.getIO(), 2);
        this.wellnessProgram = b10;
        this.features = e1.b(b10, WellnessProgramDetailViewModel$features$1.INSTANCE);
        this.screenshots = e1.b(b10, WellnessProgramDetailViewModel$screenshots$1.INSTANCE);
        this.deviceSectionTitle = e1.b(b10, new WellnessProgramDetailViewModel$deviceSectionTitle$1(this));
        this.allDevices = kn.e.c().i(user.q());
        this.programDevices = e1.b(b10, new WellnessProgramDetailViewModel$programDevices$1(this));
    }

    public final LiveData<String> getDeviceSectionTitle() {
        return this.deviceSectionTitle;
    }

    public final LiveData<List<FeatureDomain>> getFeatures() {
        return this.features;
    }

    public final LiveData<List<ProgramDeviceContainer>> getProgramDevices() {
        return this.programDevices;
    }

    public final LiveData<List<ScreenshotDomain>> getScreenshots() {
        return this.screenshots;
    }

    public final User getUser() {
        return this.user;
    }

    public final LiveData<ProgramDomain.LegacyDomain> getWellnessProgram() {
        return this.wellnessProgram;
    }

    public final void joinProgram(ProgramDomain.LegacyDomain wellnessProgram) {
        u.j(wellnessProgram, "wellnessProgram");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new WellnessProgramDetailViewModel$joinProgram$1(this, wellnessProgram, null), 2, null);
    }
}
