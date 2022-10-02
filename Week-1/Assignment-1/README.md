# When a user enters an URL in the browser, how does the browser fetch the desired result ?

Every day you open up your browser and navigate to your favorite websites — whether it be social media, news, or e-commerce sites.
You go to this page by typing in a url or clicking on a link to the page.
Have you ever thought about what happens behind the scenes?
How does the news get to you when you press enter after typing in the URL?
How did the images on this post show up in your browser?
How does your Twitter feed and the tweet data show up in your browser securely?

First, we’ll take a look at the relationship between websites, servers, and IP addresses. Then, we’ll go through the steps your browser takes to:

- look up the location of the server hosting the website
- make the connection to the server
- send a request to get the specific page
- handle the response from the server and
- how it renders the page so you, the viewer, can interact with the website

![how does the browser fetch the desired result](https://cdn.pressidium.com/wp-content/uploads/2016/12/web-part2-diagram-1.png "Browser Response")

# What is the main functionality of the browser?

The main function is to retrieve information from the World Wide Web and making it available for users. Visiting any website can be done using a web browser
A web browser is not the same as a search engine, despite the fact that the two are often confused. A search engine is simply a website that provides links to other websites to a user. A user must, however, have a web browser installed in order to connect to a website’s server and view its web pages.
Web browsers are primarily used to display and access websites on the internet, as well as other content created with programming languages such as Hypertext Markup Language (HTML)
A web browser’s primary function is to render HTML, the code that is used to design or “mark up” web pages. When a browser loads a web page, it processes the HTML, which may contain text, links, and references to images and other items like CSS and JavaScript functions.

### Below are some of the main functions of web browsers :

- The main task is to collect information from the Internet and make it accessible to users.
- A web browser can be used to visit any website. When we type a URL into a browser, the web server redirects us to that website.
- Plugins are available on the web browser to run Java applets and flash content.
- It simplifies Internet surfing because once we arrive at a website, we can quickly check the hyperlinks and access a wealth of information.
- Internal cache is used by browsers and is saved so that the user can open the same webpage multiple times without losing any data.
- A web browser can open multiple web pages at the same time.
- Back, forward, reload, stop reload, home, and other options are available on these web browsers, making them simple and convenient to use.

# High Level Components of a browser

- > **The user interface** : this includes the address bar, back/forward button, bookmarking menu, etc. Every part of the browser display except the window where you see the requested page.
- > **The browser engine**: marshals actions between the UI and the rendering engine.
- > **The rendering engine**: responsible for displaying requested content. For example if the requested content is HTML, the rendering engine parses HTML and CSS, and displays the parsed content on the screen.
- > **Networking**: for network calls such as HTTP requests, using different implementations for different platform behind a platform-independent interface.
- > **UI backend**: used for drawing basic widgets like combo boxes and windows. This backend exposes a generic interface that is not platform specific. Underneath it uses operating system user interface methods.
- > **JavaScript interpreter**. Used to parse and execute JavaScript code.
- > **Data storage**. This is a persistence layer. The browser may need to save all sorts of data locally, such as cookies. Browsers also support storage mechanisms such as localStorage, IndexedDB, WebSQL and FileSystem.

# Rendering Engine and I'ts Use

## Role of Rendering Engine:

Once a user requests a particular document, the rendering engine starts fetching the content of the requested document. This is done via the networking layer. The rendering engine starts receiving the content of that specific document in chunks of 8 KBs from the networking layer. After this, the basic flow of the rendering engine begins.

As discussed earlier, every browser has its own unique rendering engine. So naturally, every browser has its own way of interpreting web pages on a user’s screen. Here’s where a challenge arises for web developers regarding the cross-browser compatibility of their website.

## Rendering Engine Uses:

As the name suggests, this component is responsible for rendering a specific web page requested by the user on their screen. It interprets HTML and XML documents along with images that are styled or formatted using CSS, and a final layout is generated, which is displayed on the user interface.

# Parsers (HTML, CSS, etc)

## What means parser?

A parser is a compiler or interpreter component that breaks data into smaller elements for easy translation into another language. A parser takes input in the form of a sequence of tokens, interactive commands, or program instructions and breaks them up into parts that can be used by other components in programming.

# Script Processor

The Script processor allows you to specify your own processor logic for a simple processor using JavaScript or Groovy. The script is entered as an option on the script processor

The script processor executes Javascript code to process an event. The processor uses a pure Go implementation of ECMAScript 5.1 and has no external dependencies. This can be useful in situations where one of the other processors doesn’t provide the functionality you need to filter events.

# Layout and Painting

- ### **Layout**

  - The layout (also called reflow) peace will be in charge to calculate the positions and dimensions of each node on the screen. For instance, if you rotate your phone, or if you resize your browser, the layout peace will be executed.

* ### **Painting**

  - This is the process of filling in pixels. It involves drawing out elements.

* ### **Composition**
  - Combining two or more images/elements to make a single graphic is composition.
