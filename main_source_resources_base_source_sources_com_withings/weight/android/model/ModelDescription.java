package com.withings.weight.android.model;

import androidx.compose.material.o;
import dp0.j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.c1;
import kotlin.jvm.internal.u;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModelDescription.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\"#BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016j\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006$"}, d2 = {"Lcom/withings/weight/android/model/ModelDescription;", "", "mesh", "Lcom/withings/weight/android/model/ModelDescription$FileDescription;", "lightThemeVisual", "Lcom/withings/weight/android/model/ModelDescription$Visual;", "darkThemeVisual", "shapeKey", "", "torsoKey", "rightArmKey", "leftArmKey", "rightLegKey", "leftLegKey", "(Ljava/lang/String;ILcom/withings/weight/android/model/ModelDescription$FileDescription;Lcom/withings/weight/android/model/ModelDescription$Visual;Lcom/withings/weight/android/model/ModelDescription$Visual;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDarkThemeVisual", "()Lcom/withings/weight/android/model/ModelDescription$Visual;", "files", "", "getFiles", "()Ljava/util/Set;", "getLeftArmKey", "()Ljava/lang/String;", "getLeftLegKey", "getLightThemeVisual", "getMesh", "()Lcom/withings/weight/android/model/ModelDescription$FileDescription;", "getRightArmKey", "getRightLegKey", "getShapeKey", "getTorsoKey", "Female", "Male", "Neutral", "FileDescription", "Visual", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModelDescription {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ModelDescription[] $VALUES;
    public static final ModelDescription Female;
    public static final ModelDescription Male;
    public static final ModelDescription Neutral;
    private final Visual darkThemeVisual;
    private final Set<FileDescription> files;
    private final String leftArmKey;
    private final String leftLegKey;
    private final Visual lightThemeVisual;
    private final FileDescription mesh;
    private final String rightArmKey;
    private final String rightLegKey;
    private final String shapeKey;
    private final String torsoKey;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModelDescription.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, d2 = {"Lcom/withings/weight/android/model/ModelDescription$FileDescription;", "", "localPathName", "", "url", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "extension", "Lcom/withings/weight/android/model/ModelDescription$FileDescription$Extension;", "getExtension", "()Lcom/withings/weight/android/model/ModelDescription$FileDescription$Extension;", "localPath", "getLocalPath", "()Ljava/lang/String;", "getLocalPathName", "getUrl", "BodyBlurMaterial", "BodyLimbsMaterial", "BodyShapeMaterial", "FemaleMesh", "FemaleBlur", "FemaleRoughness", "FemaleTransparent", "FullScreenQuadBlurMaterial", "IndirectLightMap", "NeutralMesh", "MaleMesh", "MaleBlur", "MaleRoughness", "MaleTransparent", "Extension", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FileDescription {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FileDescription[] $VALUES;
        private final String localPathName;
        private final String url;
        public static final FileDescription BodyBlurMaterial = new FileDescription("BodyBlurMaterial", 0, "BodyBlur.filamat", "https://static.withings.com/content/app/healthmate/3d_models/fillament_v2/BodyBlur.filamat");
        public static final FileDescription BodyLimbsMaterial = new FileDescription("BodyLimbsMaterial", 1, "BodyPart.filamat", "https://static.withings.com/content/app/healthmate/3d_models/fillament_v2/BodyPart.filamat");
        public static final FileDescription BodyShapeMaterial = new FileDescription("BodyShapeMaterial", 2, "BodyShape.filamat", "https://static.withings.com/content/app/healthmate/3d_models/fillament_v2/BodyShape.filamat");
        public static final FileDescription FemaleMesh = new FileDescription("FemaleMesh", 3, "Woman.glb", "https://static.withings.com/content/app/healthmate/3d_models/woman_body/woman_body.glb");
        public static final FileDescription FemaleBlur = new FileDescription("FemaleBlur", 4, "FemaleBlur.ktx", "https://static.withings.com/content/app/healthmate/3d_models/woman_body/FemaleBlur.ktx");
        public static final FileDescription FemaleRoughness = new FileDescription("FemaleRoughness", 5, "FemaleRoughness.ktx", "https://static.withings.com/content/app/healthmate/3d_models/woman_body/FemaleRoughness.ktx");
        public static final FileDescription FemaleTransparent = new FileDescription("FemaleTransparent", 6, "FemaleTransparent.ktx", "https://static.withings.com/content/app/healthmate/3d_models/woman_body/FemaleTransparent.ktx");
        public static final FileDescription FullScreenQuadBlurMaterial = new FileDescription("FullScreenQuadBlurMaterial", 7, "FullScreenQuadBlur.filamat", "https://static.withings.com/content/app/healthmate/3d_models/fillament_v2/FullScreenQuadBlur.filamat");
        public static final FileDescription IndirectLightMap = new FileDescription("IndirectLightMap", 8, "GSG_PRO_STUDIOS_METAL_045_sm_ibl.ktx", "https://static.withings.com/content/app/healthmate/3d_models/fillament/GSG_PRO_STUDIOS_METAL_045_sm_ibl.ktx");
        public static final FileDescription NeutralMesh = new FileDescription("NeutralMesh", 9, "Neutral.glb", "https://static.withings.com/content/app/healthmate/3d_models/neutral_body/neutral_body.glb");
        public static final FileDescription MaleMesh = new FileDescription("MaleMesh", 10, "Male.glb", "https://static.withings.com/content/app/healthmate/3d_models/man_body/man_body.glb");
        public static final FileDescription MaleBlur = new FileDescription("MaleBlur", 11, "MaleBlur.ktx", "https://static.withings.com/content/app/healthmate/3d_models/man_body/MaleBlur.ktx");
        public static final FileDescription MaleRoughness = new FileDescription("MaleRoughness", 12, "MaleRoughness.ktx", "https://static.withings.com/content/app/healthmate/3d_models/man_body/MaleRoughness.ktx");
        public static final FileDescription MaleTransparent = new FileDescription("MaleTransparent", 13, "MaleTransparent.ktx", "https://static.withings.com/content/app/healthmate/3d_models/man_body/MaleTransparent.ktx");

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ModelDescription.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/weight/android/model/ModelDescription$FileDescription$Extension;", "", "(Ljava/lang/String;I)V", "Filamat", "Glb", "Gltf", "Ktx", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Extension {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Extension[] $VALUES;
            public static final Extension Filamat = new Extension("Filamat", 0);
            public static final Extension Glb = new Extension("Glb", 1);
            public static final Extension Gltf = new Extension("Gltf", 2);
            public static final Extension Ktx = new Extension("Ktx", 3);

            private static final /* synthetic */ Extension[] $values() {
                return new Extension[]{Filamat, Glb, Gltf, Ktx};
            }

            static {
                Extension[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Extension(String str, int i11) {
            }

            public static a<Extension> getEntries() {
                return $ENTRIES;
            }

            public static Extension valueOf(String str) {
                return (Extension) Enum.valueOf(Extension.class, str);
            }

            public static Extension[] values() {
                return (Extension[]) $VALUES.clone();
            }
        }

        private static final /* synthetic */ FileDescription[] $values() {
            return new FileDescription[]{BodyBlurMaterial, BodyLimbsMaterial, BodyShapeMaterial, FemaleMesh, FemaleBlur, FemaleRoughness, FemaleTransparent, FullScreenQuadBlurMaterial, IndirectLightMap, NeutralMesh, MaleMesh, MaleBlur, MaleRoughness, MaleTransparent};
        }

        static {
            FileDescription[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FileDescription(String str, int i11, String str2, String str3) {
            this.localPathName = str2;
            this.url = str3;
        }

        public static a<FileDescription> getEntries() {
            return $ENTRIES;
        }

        public static FileDescription valueOf(String str) {
            return (FileDescription) Enum.valueOf(FileDescription.class, str);
        }

        public static FileDescription[] values() {
            return (FileDescription[]) $VALUES.clone();
        }

        public final Extension getExtension() {
            String str = this.localPathName;
            String X = j.X('.', str, str);
            if (X.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) dp0.a.d(X.charAt(0)));
                String substring = X.substring(1);
                u.i(substring, "substring(...)");
                sb2.append(substring);
                X = sb2.toString();
            }
            return Extension.valueOf(X);
        }

        public final String getLocalPath() {
            return j.b0('/', this.localPathName, ".").concat("/");
        }

        public final String getLocalPathName() {
            return this.localPathName;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: ModelDescription.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006$"}, d2 = {"Lcom/withings/weight/android/model/ModelDescription$Visual;", "", "opacityMap", "Lcom/withings/weight/android/model/ModelDescription$FileDescription;", "roughnessMap", "blurIntensityMap", "shapeDiffuseIntensity", "", "shapeOpacityIntensity", "shapeEmissionIntensity", "shapeRoughnessIntensity", "(Lcom/withings/weight/android/model/ModelDescription$FileDescription;Lcom/withings/weight/android/model/ModelDescription$FileDescription;Lcom/withings/weight/android/model/ModelDescription$FileDescription;FFFF)V", "getBlurIntensityMap", "()Lcom/withings/weight/android/model/ModelDescription$FileDescription;", "getOpacityMap", "getRoughnessMap", "getShapeDiffuseIntensity", "()F", "getShapeEmissionIntensity", "getShapeOpacityIntensity", "getShapeRoughnessIntensity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Visual {
        private final FileDescription blurIntensityMap;
        private final FileDescription opacityMap;
        private final FileDescription roughnessMap;
        private final float shapeDiffuseIntensity;
        private final float shapeEmissionIntensity;
        private final float shapeOpacityIntensity;
        private final float shapeRoughnessIntensity;

        public Visual(FileDescription opacityMap, FileDescription roughnessMap, FileDescription blurIntensityMap, float f11, float f12, float f13, float f14) {
            u.j(opacityMap, "opacityMap");
            u.j(roughnessMap, "roughnessMap");
            u.j(blurIntensityMap, "blurIntensityMap");
            this.opacityMap = opacityMap;
            this.roughnessMap = roughnessMap;
            this.blurIntensityMap = blurIntensityMap;
            this.shapeDiffuseIntensity = f11;
            this.shapeOpacityIntensity = f12;
            this.shapeEmissionIntensity = f13;
            this.shapeRoughnessIntensity = f14;
        }

        public static /* synthetic */ Visual copy$default(Visual visual, FileDescription fileDescription, FileDescription fileDescription2, FileDescription fileDescription3, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fileDescription = visual.opacityMap;
            }
            if ((i11 & 2) != 0) {
                fileDescription2 = visual.roughnessMap;
            }
            FileDescription fileDescription4 = fileDescription2;
            if ((i11 & 4) != 0) {
                fileDescription3 = visual.blurIntensityMap;
            }
            FileDescription fileDescription5 = fileDescription3;
            if ((i11 & 8) != 0) {
                f11 = visual.shapeDiffuseIntensity;
            }
            float f15 = f11;
            if ((i11 & 16) != 0) {
                f12 = visual.shapeOpacityIntensity;
            }
            float f16 = f12;
            if ((i11 & 32) != 0) {
                f13 = visual.shapeEmissionIntensity;
            }
            float f17 = f13;
            if ((i11 & 64) != 0) {
                f14 = visual.shapeRoughnessIntensity;
            }
            return visual.copy(fileDescription, fileDescription4, fileDescription5, f15, f16, f17, f14);
        }

        public final FileDescription component1() {
            return this.opacityMap;
        }

        public final FileDescription component2() {
            return this.roughnessMap;
        }

        public final FileDescription component3() {
            return this.blurIntensityMap;
        }

        public final float component4() {
            return this.shapeDiffuseIntensity;
        }

        public final float component5() {
            return this.shapeOpacityIntensity;
        }

        public final float component6() {
            return this.shapeEmissionIntensity;
        }

        public final float component7() {
            return this.shapeRoughnessIntensity;
        }

        public final Visual copy(FileDescription opacityMap, FileDescription roughnessMap, FileDescription blurIntensityMap, float f11, float f12, float f13, float f14) {
            u.j(opacityMap, "opacityMap");
            u.j(roughnessMap, "roughnessMap");
            u.j(blurIntensityMap, "blurIntensityMap");
            return new Visual(opacityMap, roughnessMap, blurIntensityMap, f11, f12, f13, f14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Visual)) {
                return false;
            }
            Visual visual = (Visual) obj;
            if (this.opacityMap == visual.opacityMap && this.roughnessMap == visual.roughnessMap && this.blurIntensityMap == visual.blurIntensityMap && Float.compare(this.shapeDiffuseIntensity, visual.shapeDiffuseIntensity) == 0 && Float.compare(this.shapeOpacityIntensity, visual.shapeOpacityIntensity) == 0 && Float.compare(this.shapeEmissionIntensity, visual.shapeEmissionIntensity) == 0 && Float.compare(this.shapeRoughnessIntensity, visual.shapeRoughnessIntensity) == 0) {
                return true;
            }
            return false;
        }

        public final FileDescription getBlurIntensityMap() {
            return this.blurIntensityMap;
        }

        public final FileDescription getOpacityMap() {
            return this.opacityMap;
        }

        public final FileDescription getRoughnessMap() {
            return this.roughnessMap;
        }

        public final float getShapeDiffuseIntensity() {
            return this.shapeDiffuseIntensity;
        }

        public final float getShapeEmissionIntensity() {
            return this.shapeEmissionIntensity;
        }

        public final float getShapeOpacityIntensity() {
            return this.shapeOpacityIntensity;
        }

        public final float getShapeRoughnessIntensity() {
            return this.shapeRoughnessIntensity;
        }

        public int hashCode() {
            int hashCode = this.roughnessMap.hashCode();
            int hashCode2 = this.blurIntensityMap.hashCode();
            return Float.hashCode(this.shapeRoughnessIntensity) + o.a(this.shapeEmissionIntensity, o.a(this.shapeOpacityIntensity, o.a(this.shapeDiffuseIntensity, (hashCode2 + ((hashCode + (this.opacityMap.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        }

        public String toString() {
            FileDescription fileDescription = this.opacityMap;
            FileDescription fileDescription2 = this.roughnessMap;
            FileDescription fileDescription3 = this.blurIntensityMap;
            float f11 = this.shapeDiffuseIntensity;
            float f12 = this.shapeOpacityIntensity;
            float f13 = this.shapeEmissionIntensity;
            float f14 = this.shapeRoughnessIntensity;
            StringBuilder sb2 = new StringBuilder("Visual(opacityMap=");
            sb2.append(fileDescription);
            sb2.append(", roughnessMap=");
            sb2.append(fileDescription2);
            sb2.append(", blurIntensityMap=");
            sb2.append(fileDescription3);
            sb2.append(", shapeDiffuseIntensity=");
            sb2.append(f11);
            sb2.append(", shapeOpacityIntensity=");
            sb2.append(f12);
            sb2.append(", shapeEmissionIntensity=");
            sb2.append(f13);
            sb2.append(", shapeRoughnessIntensity=");
            return a0.a.b(sb2, f14, ")");
        }
    }

    private static final /* synthetic */ ModelDescription[] $values() {
        return new ModelDescription[]{Female, Male, Neutral};
    }

    static {
        FileDescription fileDescription = FileDescription.FemaleMesh;
        FileDescription fileDescription2 = FileDescription.FemaleTransparent;
        FileDescription fileDescription3 = FileDescription.FemaleRoughness;
        FileDescription fileDescription4 = FileDescription.FemaleBlur;
        Female = new ModelDescription("Female", 0, fileDescription, new Visual(fileDescription2, fileDescription3, fileDescription4, 0.9f, 0.6f, 0.5f, 0.9f), new Visual(fileDescription2, fileDescription3, fileDescription4, 0.9f, 0.6f, 0.5f, 0.9f), "FemaleShape.001", "Female_Torso", "Female_Arm_Right", "Female_Arm_Left", "Female_Leg_Right", "Female_Leg_Left");
        FileDescription fileDescription5 = FileDescription.MaleMesh;
        FileDescription fileDescription6 = FileDescription.MaleTransparent;
        FileDescription fileDescription7 = FileDescription.MaleRoughness;
        FileDescription fileDescription8 = FileDescription.MaleBlur;
        Male = new ModelDescription("Male", 1, fileDescription5, new Visual(fileDescription6, fileDescription7, fileDescription8, 0.9f, 0.6f, 0.5f, 0.9f), new Visual(fileDescription6, fileDescription7, fileDescription8, 0.9f, 0.6f, 0.5f, 0.9f), "MaleShape.001", "Male_Torso", "Male_Arm_Right", "Male_Arm_Left", "Male_Leg_Right", "Male_Leg_Left");
        Neutral = new ModelDescription("Neutral", 2, FileDescription.NeutralMesh, new Visual(fileDescription2, fileDescription3, fileDescription4, 0.9f, 0.6f, 0.5f, 0.9f), new Visual(fileDescription2, fileDescription3, fileDescription4, 0.9f, 0.6f, 0.5f, 0.9f), "NeutralShape.001", "Neutral_Torso", "Neutral_Arm_Right", "Neutral_Arm_Left", "Neutral_Leg_Right", "Neutral_Leg_Left");
        ModelDescription[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ModelDescription(String str, int i11, FileDescription fileDescription, Visual visual, Visual visual2, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.mesh = fileDescription;
        this.lightThemeVisual = visual;
        this.darkThemeVisual = visual2;
        this.shapeKey = str2;
        this.torsoKey = str3;
        this.rightArmKey = str4;
        this.leftArmKey = str5;
        this.rightLegKey = str6;
        this.leftLegKey = str7;
        this.files = c1.h(fileDescription, visual.getBlurIntensityMap(), visual.getRoughnessMap(), visual.getOpacityMap(), visual2.getBlurIntensityMap(), visual2.getRoughnessMap(), visual2.getOpacityMap(), FileDescription.IndirectLightMap, FileDescription.FullScreenQuadBlurMaterial, FileDescription.BodyShapeMaterial, FileDescription.BodyLimbsMaterial, FileDescription.BodyBlurMaterial);
    }

    public static a<ModelDescription> getEntries() {
        return $ENTRIES;
    }

    public static ModelDescription valueOf(String str) {
        return (ModelDescription) Enum.valueOf(ModelDescription.class, str);
    }

    public static ModelDescription[] values() {
        return (ModelDescription[]) $VALUES.clone();
    }

    public final Visual getDarkThemeVisual() {
        return this.darkThemeVisual;
    }

    public final Set<FileDescription> getFiles() {
        return this.files;
    }

    public final String getLeftArmKey() {
        return this.leftArmKey;
    }

    public final String getLeftLegKey() {
        return this.leftLegKey;
    }

    public final Visual getLightThemeVisual() {
        return this.lightThemeVisual;
    }

    public final FileDescription getMesh() {
        return this.mesh;
    }

    public final String getRightArmKey() {
        return this.rightArmKey;
    }

    public final String getRightLegKey() {
        return this.rightLegKey;
    }

    public final String getShapeKey() {
        return this.shapeKey;
    }

    public final String getTorsoKey() {
        return this.torsoKey;
    }
}
