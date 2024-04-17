package com.withings.screen.domain.uc;

import androidx.camera.camera2.internal.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: GetMissingFeatureTagUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u0086\u0002¨\u0006\f"}, d2 = {"Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase;", "", "()V", "invoke", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result;", "requiredFeatureTags", "", "", "featureTags", "", "", "Result", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetMissingFeatureTagUseCase {

    /* compiled from: GetMissingFeatureTagUseCase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result;", "", "Locked", "MissingFeatureTag", "Unlocked", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result$Locked;", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result$MissingFeatureTag;", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result$Unlocked;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Result {

        /* compiled from: GetMissingFeatureTagUseCase.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result$Locked;", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Locked implements Result {
            public static final Locked INSTANCE = new Locked();

            private Locked() {
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Locked)) {
                    return false;
                }
                Locked locked = (Locked) obj;
                return true;
            }

            public int hashCode() {
                return -622963550;
            }

            public String toString() {
                return "Locked";
            }
        }

        /* compiled from: GetMissingFeatureTagUseCase.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result$MissingFeatureTag;", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result;", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MissingFeatureTag implements Result {

            /* renamed from: id  reason: collision with root package name */
            private final int f43960id;

            public MissingFeatureTag(int i11) {
                this.f43960id = i11;
            }

            public static /* synthetic */ MissingFeatureTag copy$default(MissingFeatureTag missingFeatureTag, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = missingFeatureTag.f43960id;
                }
                return missingFeatureTag.copy(i11);
            }

            public final int component1() {
                return this.f43960id;
            }

            public final MissingFeatureTag copy(int i11) {
                return new MissingFeatureTag(i11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof MissingFeatureTag) && this.f43960id == ((MissingFeatureTag) obj).f43960id) {
                    return true;
                }
                return false;
            }

            public final int getId() {
                return this.f43960id;
            }

            public int hashCode() {
                return Integer.hashCode(this.f43960id);
            }

            public String toString() {
                return o0.a("MissingFeatureTag(id=", this.f43960id, ")");
            }
        }

        /* compiled from: GetMissingFeatureTagUseCase.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result$Unlocked;", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase$Result;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Unlocked implements Result {
            public static final Unlocked INSTANCE = new Unlocked();

            private Unlocked() {
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unlocked)) {
                    return false;
                }
                Unlocked unlocked = (Unlocked) obj;
                return true;
            }

            public int hashCode() {
                return 506676859;
            }

            public String toString() {
                return "Unlocked";
            }
        }
    }

    public final Result invoke(List<? extends List<Integer>> requiredFeatureTags, Map<Integer, Boolean> featureTags) {
        u.j(requiredFeatureTags, "requiredFeatureTags");
        u.j(featureTags, "featureTags");
        if (requiredFeatureTags.isEmpty()) {
            return Result.Unlocked.INSTANCE;
        }
        ArrayList<List> arrayList = new ArrayList();
        for (Object obj : requiredFeatureTags) {
            List<Number> list = (List) obj;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Number number : list) {
                    int intValue = number.intValue();
                    if (featureTags.isEmpty()) {
                        break;
                    }
                    for (Map.Entry<Integer, Boolean> entry : featureTags.entrySet()) {
                        if (entry.getKey().intValue() == intValue) {
                            break;
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        if (!(!arrayList.isEmpty())) {
            return Result.Locked.INSTANCE;
        }
        ArrayList<List> arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (List list2 : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                int intValue2 = ((Number) obj2).intValue();
                for (j jVar : s0.o(featureTags)) {
                    if (((Number) jVar.a()).intValue() == intValue2) {
                        if (!((Boolean) jVar.d()).booleanValue()) {
                            arrayList3.add(obj2);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            arrayList2.add(arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            for (List list3 : arrayList2) {
                if (list3.isEmpty()) {
                    return Result.Unlocked.INSTANCE;
                }
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int size = ((List) next).size();
                do {
                    Object next2 = it.next();
                    int size2 = ((List) next2).size();
                    if (size > size2) {
                        next = next2;
                        size = size2;
                    }
                } while (it.hasNext());
                return new Result.MissingFeatureTag(((Number) x.I((List) next)).intValue());
            }
            return new Result.MissingFeatureTag(((Number) x.I((List) next)).intValue());
        }
        throw new NoSuchElementException();
    }
}
