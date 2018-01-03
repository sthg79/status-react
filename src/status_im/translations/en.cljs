(ns status-im.translations.en)

(def translations
  {
   ;;common
   :members-title                         "メンバー"
   :not-implemented                       "実装されていません"
   :chat-name                             "チャット名"
   :notifications-title                   "通知と音声"
   :offline                               "オフライン"
   :search-for                            "検索..."
   :cancel                                "キャンセル"
   :next                                  "次へ"
   :open                                  "Open"
   :description                           "Description"
   :url                                   "URL"
   :type-a-message                        "メッセージを入力する..."
   :type-a-command                        "コマンドを入力する..."
   :error                                 "エラー"
   :unknown-status-go-error               "Unknown status-go error"
   :node-unavailable                      "No ethereum node running"
   :yes                                   "Yes"
   :no                                    "No"

   :camera-access-error                   "カメラを利用できません。設定よりカメラの使用を許可してください。"
   :photos-access-error                   "写真を取得できません。設定より写真へのアクセスを許可してください。"

   ;;drawer
   :switch-users                          "ユーザーの切り替え"
   :current-network                       "現在のネットワーク"

   ;;chat
   :is-typing                             "が入力中"
   :and-you                               "とあなた"
   :search-chat                           "チャットを検索"
   :members                               {:one   "1人のメンバー"
                                           :other "{{count}}人のメンバー"
                                           :zero  "メンバーがいません"}
   :members-active                        {:one   "1人がアクティブ"
                                           :other "{{count}}人がアクティブ"
                                           :zero  "アクティブなメンバーはいません"}
   :public-group-status                   "公開"
   :active-online                         "オンライン"
   :active-unknown                        "不明"
   :available                             "利用可能"
   :no-messages                           "メッセージがありません"
   :suggestions-requests                  "リクエスト"
   :suggestions-commands                  "コマンド"
   :faucet-success                        "フォーセットリクエストを受け取りました"
   :faucet-error                          "フォーセットリクエストエラー"

   ;;sync
   :sync-in-progress                      "同期中..."
   :sync-synced                           "同期しました"

   ;;messages
   :status-sending                        "送信中"
   :status-pending                        "保留中"
   :status-sent                           "送信済み"
   :status-seen-by-everyone               "全員が閲覧"
   :status-seen                           "閲覧"
   :status-delivered                      "配達済み"
   :status-failed                         "失敗しました"

   ;;datetime
   :datetime-ago-format                   "{{number}} {{time-intervals}} {{ago}}"
   :datetime-second                       {:one   "秒"
                                           :other "秒"}
   :datetime-minute                       {:one   "分"
                                           :other "分"}
   :datetime-hour                         {:one   "時間"
                                           :other "時間"}
   :datetime-day                          {:one   "日"
                                           :other "日"}
   :datetime-ago                          "前"
   :datetime-yesterday                    "昨日"
   :datetime-today                        "今日"

   ;;profile
   :profile                               "プロフィール"
   :edit-profile                          "プロフィールを編集"
   :message                               "メッセージ"
   :not-specified                         "特定されていません"
   :public-key                            "公開鍵"
   :phone-number                          "電話番号"
   :update-status                         "ステータスを更新..."
   :add-a-status                          "ステータスを追加..."
   :status-prompt                         "あなたのオファーを知らせるためにステータスを作成してください。#hashtagsも使用できます。"
   :add-to-contacts                       "連絡先に追加"
   :in-contacts                           "連絡先"
   :remove-from-contacts                  "連絡先から削除"
   :start-conversation                    "会話を始める"
   :send-transaction                      "トランザクションを送信"
   :testnet-text                          "You’re on the {{testnet}} Testnet. Do not send real ETH or SNT to your address"
   :mainnet-text                          "You’re on the Mainnet. Real ETH will be sent"

   ;;make_photo
   :image-source-title                    "プロフィール画像"
   :image-source-make-photo               "カメラを起動"
   :image-source-gallery                  "ギャラリーから選択"

   ;;sharing
   :sharing-copy-to-clipboard             "クリップボードにコピー"
   :sharing-share                         "共有..."
   :sharing-cancel                        "キャンセル"

   :browsing-title                        "閲覧"
   :browsing-open-in-web-browser          "ブラウザーで閲覧"
   :browsing-cancel                       "キャンセル"


   ;sign-up
   :contacts-syncronized                  "連絡先が同期されました"
   :confirmation-code                     (str "ありがとうございます！ 確認コードが記載されたメッセージが"
                                               "送信されました。電話番号を確認するにはそのコードを入力してください")
   :incorrect-code                        (str "申し訳ありません。コードが間違っています。もう一度入力してください")
   :phew-here-is-your-passphrase          "*お疲れ様でした。*これがパスフレーズです。*書き留めて安全な場所に保管してください！*アカウントの復元に必要になります。"
   :here-is-your-passphrase               "これがパスフレーズです。*書き留めて安全な場所に保管してください！*アカウントの復元に必要になります。"
   :phone-number-required                 "ここをタップして電話番号を入力するとお友達を検索します。"
   :shake-your-phone                      "問題点や改善点を報告する場合は、スマホを振って下さい！"
   :intro-status                          "チャットしてアカウントを設定し、設定を変更してください！"
   :intro-message1                        "ステータスにようこそ\nこのメッセージをタップして、パスワードを設定し開始しましょう！"
   :account-generation-message            "少々お待ちください。アカウントの生成するにはお時間がかかります。"
   :move-to-internal-failure-message      "いくつかの重要なファイルを外部メディアに保存します。続行するには、許可が必要です。（将来的には外部メディアを使用しないようにします。）"
   :debug-enabled                         "デバッグサーバーを起動しました！ *status-dev-cli scan*を実行すると、同じネットワーク上のコンピュータからサーバーを見つけることができます。"

   ;;phone types
   :phone-e164                            "国際 1"
   :phone-international                   "国際 2"
   :phone-national                        "国内"
   :phone-significant                     "Significant"


   ;;chats
   :chats                                 "チャット"
   :delete-chat                           "チャットを削除"
   :new-group-chat                        "新規グループチャット"
   :new-public-group-chat                 "公開チャットに参加"
   :edit-chats                            "チャットを偏執"
   :search-chats                          "チャットを検索"
   :empty-topic                           "空のトピック"
   :topic-format                          "間違った形式 [a-z0-9\\-]+"
   :public-group-topic                    "トピック"


   ;;discover
   :discover                              "発見"
   :none                                  "なし"
   :search-tags                           "ここに検索タグを入力してください"
   :popular-tags                          "人気のタグ"
   :recent                                "最近"
   :no-statuses-found                     "ステータスが見つかりませんでした"
   :chat                                  "Chat"
   :all                                   "All"
   :public-chats                          "Public chats"
   :soon                                  "Soon"
   :public-chat-user-count                "{{count}} people"
   :dapps                                 "ÐApps"
   :dapp-profile                          "ÐApp profile"
   :no-statuses-discovered                "ステータスを発見できませんでした"
   :no-statuses-discovered-body           "When somebody posts\na status you will see it here."
   :no-hashtags-discovered-title          "No #hashtags discovered"
   :no-hashtags-discovered-body           "When a #hashtag becomes\npopular you will see it here."

   ;;settings
   :settings                              "設定"

   ;;contacts
   :contacts                              "連絡先"
   :new-contact                           "新規連絡先"
   :delete-contact                        "連絡先を削除"
   :delete-contact-confirmation           "連絡帳よりこの連絡先を削除します"
   :remove-from-group                     "グループから削除"
   :edit-contacts                         "連絡先を偏執"
   :search-contacts                       "連絡先を検索"
   :contacts-group-new-chat               "新規チャットを開始"
   :choose-from-contacts                  "連絡先から選択"
   :no-contacts                           "まだ連絡先がありません"
   :show-qr                               "QRを表示"
   :enter-address                         "アドレスを入力してください"
   :more                                  "もっと"

   ;;group-settings
   :remove                                "削除"
   :save                                  "保存"
   :delete                                "削除"
   :clear-history                         "履歴の消去"
   :mute-notifications                    "お知らせをミュート"
   :leave-chat                            "チャットから退出"
   :chat-settings                         "チャット設定"
   :edit                                  "偏執"
   :add-members                           "メンバーを追加"

   ;;commands
   :chat-send-eth                         "{{amount}} ETH"

   ;;location command
   :your-current-location                 "Your current location"
   :places-nearby                         "Places nearby"
   :search-results                        "Search results"
   :dropped-pin                           "Dropped pin"
   :location                              "Location"
   :open-map                              "Open Map"
   :sharing-copy-to-clipboard-address     "Copy the Address"
   :sharing-copy-to-clipboard-coordinates "Copy coordinates"

   ;;new-group
   :new-group                             "新しいグループ"
   :reorder-groups                        "グループを並び替え"
   :edit-group                            "グループを偏執"
   :delete-group                          "グループを削除"
   :delete-group-confirmation             "このグループを削除します。連絡先には影響を与えません。"
   :delete-group-prompt                   "連絡先には影響を与えません。"
   :contact-s                             {:one   "連絡先"
                                           :other "連絡先"}

   ;;protocol
   :received-invitation                   "チャット招待状を受信しました"
   :removed-from-chat                     "グループチャットから削除されました"
   :left                                  "残り"
   :invited                               "招待済み"
   :removed                               "削除済み"
   :You                                   "あなた"

   ;;new-contact
   :add-new-contact                       "新規連絡先を追加"
   :scan-qr                               "QRをスキャン"
   :name                                  "名前"
   :address-explication                   "ここにアドレスについての説明や、どこで見つけられるのかを入力してください"
   :enter-valid-public-key                "有効な公開鍵を入力するかQRコードをスキャンしてください"
   :contact-already-added                 "連絡先はすでに追加されています"
   :can-not-add-yourself                  "自分自身を追加することはできません"
   :unknown-address                       "不明なアドレス"

   ;;login
   :connect                               "接続"
   :address                               "アドレス"
   :password                              "パスワード"
   :sign-in-to-status                     "ステータスにサインイン"
   :sign-in                               "サインイン"
   :wrong-password                        "パスワードが間違っています"
   :enter-password                        "Enter password"

   ;;recover
   :passphrase                            "パスフレーズ"
   :recover                               "復元"
   :twelve-words-in-correct-order         "正しい順序で12ワード"

   ;;accounts
   :recover-access                        "アクセスを復元"
   :create-new-account                    "新規アカウントを作成"

   ;;wallet-qr-code
   :done                                  "完了"

   ;;validation
   :invalid-phone                         "無効な電話番号"
   :amount                                "金額"

   ;;transactions
   :confirm                               "確認"
   :transaction                           "トランザクション"
   :unsigned-transaction-expired          "Unsigned transaction expired"
   :status                                "ステータス"
   :recipient                             "受信者"
   :to                                    "宛先"
   :from                                  "送信元"
   :data                                  "データ"
   :got-it                                "理解しました"
   :block                                 "Block"
   :hash                                  "Hash"
   :gas-limit                             "Gas limit"
   :gas-price                             "Gas price"
   :gas-used                              "Gas used"
   :cost-fee                              "Cost/Fee"
   :nonce                                 "Nonce"
   :confirmations                         "Confirmations"
   :confirmations-helper-text             "Please wait for at least 12 confirmations to make sure your transaction is processed securely"
   :copy-transaction-hash                 "Copy transaction hash"
   :open-on-etherscan                     "Open on Etherscan.io"
   :incoming                              "Incoming"
   :outgoing                              "Outgoing"
   :pending                               "Pending"
   :postponed                             "Postponed"

   ;;webview
   :web-view-error                        "おっと、エラーが発生しました。"})

   ;;testfairy warning
   :testfairy-title                       "Warning!"
   :testfairy-message                     "You are using an app installed from a nightly build. For testing purposes this build includes session recording if wifi connection is used, so all your interactions with this app is saved (as video and logs) and might be used by our development team to investigate possible issues. Saved video/logs do not include your passwords. Recording is done only if the app is installed from a nightly build. Nothing is recorded if the app is installed from PlayStore or TestFlight."

   ;; wallet
   :wallet                                "Wallet"
   :wallets                               "Wallets"
   :your-wallets                          "Your wallets"
   :main-wallet                           "メインウォレット"
   :wallet-error                          "Error loading data"
   :wallet-send                           "Send"
   :wallet-send-token                     "Send {{symbol}}"
   :wallet-request                        "Request"
   :wallet-exchange                       "Exchange"
   :wallet-assets                         "Assets"
   :wallet-add-asset                      "Add asset"
   :wallet-total-value                    "Total value"
   :wallet-settings                       "Wallet settings"
   :wallet-manage-assets                  "Manage Assets"
   :signing-phrase-description            "Sign the transaction by entering your password. Make sure that the words above match your secret signing phrase"
   :wallet-insufficient-funds             "Insufficient funds"
   :wallet-my-token                       "My {{symbol}}"
   :wallet-market-value                   "Market value"
   :request-transaction                   "Request transaction"
   :send-request                          "Send request"
   :share                                 "Share"
   :eth                                   "ETH"
   :currency                              "Currency"
   :usd-currency                          "USD"
   :transactions                          "Transactions"
   :transaction-details                   "Transaction details"
   :transaction-failed                    "Transaction failed"
   :transactions-sign                     "Sign"
   :transactions-sign-all                 "Sign all"
   :transactions-sign-transaction         "Sign transaction"
   :transactions-sign-later               "Sign later"
   :transactions-delete                   "Delete transaction"
   :transactions-delete-content           "Transaction will be removed from 'Unsigned' list"
   :transactions-history                  "History"
   :transactions-unsigned                 "Unsigned"
   :transactions-history-empty            "No transactions in your history yet"
   :transactions-unsigned-empty           "You don't have any unsigned transactions"
   :transactions-filter-title             "Filter history"
   :transactions-filter-tokens            "Tokens"
   :transactions-filter-type              "Type"
   :transactions-filter-select-all        "Select all"
   :view-transaction-details              "View transaction details"
   :transaction-description               "Please wait for at least 12 confirmations to make sure your transaction is processed securely"
   :transaction-sent                      "Transaction sent"
   :transaction-moved-text                "The transaction will remain in the 'Unsigned' list for the next 5 mins"
   :transaction-moved-title               "Transaction moved"
   :sign-later-title                      "Sign transaction later?"
   :sign-later-text                       "Check the transaction history to sign this transaction"
   :not-applicable                        "Not applicable for unsigned transactions"

   ;; Wallet Send
   :wallet-choose-recipient               "Choose Recipient"
   :wallet-choose-from-contacts           "Choose From Contacts"
   :wallet-address-from-clipboard         "Use Address From Clipboard"
   :wallet-invalid-address                "Invalid address: \n {{data}}"
   :wallet-invalid-chain-id               "Network does not match: \n {{data}}"
   :wallet-browse-photos                  "Browse Photos"
   :validation-amount-invalid-number      "Amount is not a valid number"
   :validation-amount-is-too-precise      "Amount is too precise. The smallest unit you can send is 1 Wei (1x10^-18 ETH)"



   ;; network settings
   :new-network                           "New network"
   :add-network                           "Add network"
   :add-new-network                       "Add new network"
   :add-wnode                             "Add mailserver"
   :existing-networks                     "Existing networks"
   ;; TODO(dmitryn): come up with better description/naming. Suggested namings: Mailbox and Master Node
   :existing-wnodes                       "Existing mailservers"
   :add-json-file                         "Add a JSON file"
   :paste-json-as-text                    "Paste JSON as text"
   :paste-json                            "Paste JSON"
   :specify-rpc-url                       "Specify a RPC URL"
   :edit-network-config                   "Edit network config"
   :connected                             "Connected"
   :process-json                          "Process JSON"
   :error-processing-json                 "Error processing JSON"
   :rpc-url                               "RPC URL"
   :remove-network                        "Remove network"
   :network-settings                      "Network settings"
   :offline-messaging-settings            "Offline messages settings"
   :edit-network-warning                  "Be careful, editing the network data may disable this network for you"
   :connecting-requires-login             "Connecting to another network requires login"
   :close-app-title                       "Warning!"
   :close-app-content                     "The app will stop and close. When you reopen it, the selected network will be used"
   :close-app-button                      "Confirm"})
