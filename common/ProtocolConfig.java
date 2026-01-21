package protocol;

public class ProtocolConfig {
    
    /*RESEAU*/ 
    public static final int SERVER_PORT = 4018; //Port du serveur
    public static final String SERVER_HOST = "127.0.0.1"; // IP du serveur
    
    /*CAPTURE D'ECRAN*/
    public static final int SCREEN_WIDTH = 1280;  //1280x720 px
    public static final int SCREEN_HEIGHT = 720;
    public static final int TARGET_FPS = 20; //FPS
    public static final int FRAME_DELAY_MS = 1000 / TARGET_FPS; // image par seconde
    
    /*COMPRESSION*/
    public static final float JPEG_QUALITY = 0.75f; // Qualite de l'image
    public static final String IMAGE_FORMAT = "JPEG"; //Format de l'image
    
    /*CONTRÔLE DE FLUX*/
    public static final boolean ENABLE_FRAME_SKIP = true; // Sauter frames si envoi trop lent
    public static final int SOCKET_TIMEOUT_MS = 5000; // Timeout pour les opérations réseau
    
    /*PROTOCOLE*/
    public static final int TCP_SEND_BUFFER_SIZE = 64 * 1024;
    public static final int TCP_RECEIVE_BUFFER_SIZE = 64 * 1024;
    
    /* Calcule le délai entre frames en nanosecondes (pour précision)*/
    public static long getFrameDelayNanos() {
        return FRAME_DELAY_MS * 1_000_000L;
    }
    
    /*Retourne la qualité JPEG formatée pour l'encodeur*/
    public static float getJpegQuality() {
        return Math.max(0.0f, Math.min(1.0f, JPEG_QUALITY));
    }
}
