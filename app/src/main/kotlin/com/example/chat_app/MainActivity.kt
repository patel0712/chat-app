package com.example.chat_app

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity()


//class MainActivity : AppCompatActivity() {
//
//    // Reference to the reCAPTCHA client for verification tasks
//    private lateinit var recaptchaClient: RecaptchaClient
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Initialize reCAPTCHA client (add your site key here)
//        initializeRecaptchaClient("6LcMVLMpAAAAADpRn2hhg0PfF833V8MJmklXOBxk")
//
//        // Button click listeners with improved error handling
//        findViewById<View>(R.id.btn_login).setOnClickListener {
//            executeLoginAction()
//        }
//
//        findViewById<View>(R.id.btn_redeem).setOnClickListener {
//            executeRedeemAction()
//        }
//    }
//
//    /**
//     * Initializes the reCAPTCHA client with the provided site key.
//     *
//     * @param siteKey Your reCAPTCHA Enterprise site key obtained from the Firebase console.
//     */
//    private fun initializeRecaptchaClient(siteKey: String) {
//        lifecycleScope.launch {
//            Recaptcha.getClient(application, siteKey)
//                    .onSuccess { client ->
//                        recaptchaClient = client
//                    }
//                    .onFailure { exception ->
//                        Log.e("MainActivity", "Error initializing reCAPTCHA client:", exception)
//                        // Handle initialization errors gracefully, e.g., display an error message to the user
//                    }
//        }
//    }
//
//    /**
//     * Executes a reCAPTCHA verification for login and handles the result.
//     */
//    private fun executeLoginAction() {
//        lifecycleScope.launch {
//            recaptchaClient.execute(RecaptchaAction.LOGIN)
//                    .onSuccess { token ->
//                        // Handle successful reCAPTCHA verification for login
//                        // For example, send the token along with your login request
//                        Log.d("MainActivity", "Login reCAPTCHA token: $token")
//                        // Replace with your actual login logic using the token
//                        // performLogin(token);
//                    }
//                    .onFailure { exception ->
//                        Log.e("MainActivity", "Error executing reCAPTCHA for login:", exception)
//                        // Handle verification errors gracefully, e.g., display an error message to the user
//                    }
//        }
//    }
//
//    /**
//     * Executes a reCAPTCHA verification for a custom action ("redeem") and handles the result.
//     */
//    private fun executeRedeemAction() {
//        lifecycleScope.launch {
//            recaptchaClient.execute(RecaptchaAction.custom("redeem"))
//                    .onSuccess { token ->
//                        // Handle successful reCAPTCHA verification for the "redeem" action
//                        // For example, send the token along with your redeem request
//                        Log.d("MainActivity", "Redeem reCAPTCHA token: $token")
//                        // Replace with your actual redeem logic using the token
//                        // performRedeemAction(token);
//                    }
//                    .onFailure { exception ->
//                        Log.e("MainActivity", "Error executing reCAPTCHA for redeem:", exception)
//                        // Handle verification errors gracefully, e.g., display an error message to the user
//                    }
//        }
//    }
//}

